import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 0;
        int n = nums.length;
        long sum = 0;  // Using long to avoid overflow

        while (right < n) {
            sum += nums[right];

            // Check if the current window can be made into an array with all elements as nums[right]
            long requiredSum = (long)nums[right] * (right - left + 1);
            long diff = requiredSum - sum;

            if (diff > k) {
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return right - left;
    }
}