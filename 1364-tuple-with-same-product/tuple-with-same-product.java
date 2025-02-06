class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        int n = nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int pro = nums[i] * nums[j];
                mp.put(pro, mp.getOrDefault(pro,0)+1);
            }
        }

        int ans = 0;
        for(int c:mp.values()){
            if(c >= 2)
                ans += c * (c-1)/2;
        }

        return ans*8;
    }
}