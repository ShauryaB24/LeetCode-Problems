class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList();
        int n=words1.length;
        int m=words2.length;

        int[] freq=new int[26];           
        for(int i=0; i<m; i++){
            int[] arr=new int[26];
            for(char ch:words2[i].toCharArray()){
                int idx=ch-'a';
                arr[idx]++;
                freq[idx] = (freq[idx]<arr[idx])?arr[idx]:freq[idx];
            }
        }

        for(int i=0; i<n; i++){
            int[] arr2=new int[26];       
            for(char ch:words1[i].toCharArray()){
                arr2[ch-'a']++;
            }

            if(checkSubset(freq, arr2)){
                ans.add(words1[i]);
            }
        }
        
        return ans;
    }

    boolean checkSubset(int[] arr, int[] arr2){
     
        for(int i=0; i<26; i++){
            if(arr[i]>arr2[i]){
                return false;
            }
        }    
            
        return true;
    }
}