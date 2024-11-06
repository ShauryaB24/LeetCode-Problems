class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        int n = nums.length;
        int idx = 0;
        while(idx < n){
            int beg,last;
            beg = nums[idx];
            while(idx+1<n && nums[idx+1] == nums[idx] + 1)
                idx++;
            last = nums[idx];
            if(beg == last)ans.add(beg+"");
            else
            ans.add(beg +"->"+last);
            idx++;
        }

        return ans;
    }
}