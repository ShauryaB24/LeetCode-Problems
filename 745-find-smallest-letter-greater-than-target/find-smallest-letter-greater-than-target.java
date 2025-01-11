class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = target-'a';
        int ans = Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<letters.length;i++){
            int c = letters[i]-'a';
            if(c>min && c<ans){
                ans = c;
                idx = i;
            }
        }
        
        return letters[idx];
    }
}