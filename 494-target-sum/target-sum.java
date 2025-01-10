class Solution {
    private int DP(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;

        if (sum < Math.abs(target) || (sum + target) % 2 != 0) return 0;
        int totalsum = (sum + target) / 2;

        int[] dp = new int[totalsum + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int T = totalsum; T >= num; T--) {
                dp[T] += dp[T - num];
            }
        }
        return dp[totalsum];
    }

    public int findTargetSumWays(int[] nums, int target) {
        return DP(nums, target);
    }
}