class Solution {
    public int largestAltitude(int[] gain) {
        int presum = 0;
        int ans = 0;

        for(int i=0;i<gain.length;i++) {
            presum += gain[i];
            ans = Math.max(ans,presum);
        }

        return ans;
    }
}