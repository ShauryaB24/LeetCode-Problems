class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //if(s1.length() != s2.length())return false;
        int diff = 0;
        int freq[] = new int[26];
        

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                diff++;
                freq[s1.charAt(i) - 'a']++;
                freq[s2.charAt(i) - 'a']--;
            }
        }

        for(int i:freq){
            if(i!=0)
                diff++;
        }


        return diff==0 || diff==2;


    }
}