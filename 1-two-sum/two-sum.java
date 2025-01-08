class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (m.containsKey(complement)) {
                return new int[]{m.get(complement), i};
            }
            m.put(nums[i], i);
        }

        return new int[]{}; 
    }
}