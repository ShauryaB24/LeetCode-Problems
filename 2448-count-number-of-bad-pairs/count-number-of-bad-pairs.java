class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i] - i, map.getOrDefault(nums[i] - i, (long) 0) + 1);
        }
        long count = 0;
        for (long val : map.values()) {
            count += (val * (val - 1)) / 2;
        }
        return (n * (n - 1) / 2) - count;
    }
}