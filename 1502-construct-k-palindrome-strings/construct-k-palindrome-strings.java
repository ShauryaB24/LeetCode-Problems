class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k)return false;
        int[] freq = new int[26];

        for(char c:s.toCharArray()){
            //int i = c-'a';
            freq[c-'a']++;
        }

        int odd = 0;
        for(int i=0;i<26;i++){
            if(freq[i]%2 !=0)odd++;
        }

        return odd <= k;

    }
}