class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        char[] ans = new char[s.length()];

        for(char c:s.toCharArray()){
            freq[c]++;
        }

        for(int i=0;i<s.length();){
            int max=0;
            int idx=0;
            for(int j=0;j<128;j++){
                if(max < freq[j]){
                    max = freq[j];
                    idx = j;
                }
            }

            while(freq[idx] > 0){
            ans[i++] = (char)idx;
            freq[idx]--;
        }
        }

        return new String(ans);

        
    }
}