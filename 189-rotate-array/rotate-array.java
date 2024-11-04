class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverseInRange(nums,0,nums.length-k-1);
        reverseInRange(nums,nums.length-k,nums.length-1);
        reverseInRange(nums,0,nums.length-1); 
    }
    public void reverseInRange(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }     

    }
}