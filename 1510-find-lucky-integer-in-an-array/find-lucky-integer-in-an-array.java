class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        int preans = -1;
        int ans = -1;
        for(int num:arr) {
            count[num]++;
        }

        for(int num:arr) {
            if(count[num] == num)preans = num;

            ans = Math.max(ans, preans);
        }

        return ans;
    }
}