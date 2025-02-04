class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        //int preans = -1;
        int ans = -1;
        for(int num:arr) {
            count[num]++;
        }

        for(int i=1;i<=500;i++){
            if(count[i] == i)
                ans = i;
        }
        

        return ans;
    }
}