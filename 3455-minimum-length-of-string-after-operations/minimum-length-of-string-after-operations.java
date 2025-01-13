class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];

        int ans = 0;
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        for(int num:freq){
            if(num==0)continue;
            ans += (num%2 ==0) ? 2:1;
        }

        return ans;
    }
}