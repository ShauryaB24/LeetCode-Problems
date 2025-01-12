class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num:nums){
            if(num>max)max=num;
            if(num<min)min=num;
        }

        int res = max-min - 2*k;
        if(res<0)return 0;

        return res;
    }
}