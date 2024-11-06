class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        for(int num : nums){
            if(num > max)max = num;
        }
        int idx = -1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == max)idx = i;
            if(nums[i] < max){
                int d = nums[i] * 2;
                if(d > max)return -1;
            }
        }

        return idx;
    }
}