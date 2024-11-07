class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0;
        int b=0;
        HashSet<Integer> ans = new HashSet<>();
        for(int c:aliceSizes){
            a += c;
            ans.add(c);
        }
        for(int d:bobSizes){
            b +=d;
        }
        int diff = (a-b)/2;
        for(int i=0;i<bobSizes.length;i++){
            int target = diff+bobSizes[i];
            if(ans.contains(target)){
                return new int[]{target,bobSizes[i]};
            }
        } 
        return null;
    }
}