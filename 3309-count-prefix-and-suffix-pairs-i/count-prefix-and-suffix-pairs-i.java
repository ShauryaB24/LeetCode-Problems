class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int res=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
            if(isPreAndSuf(words[i],words[j]))
                res++;
        }
        }

        return res;
    }

    public boolean isPreAndSuf(String a, String b){
        int l1 = a.length();
        int l2 = b.length();

        int size=0;
        if(l1>l2)
            return false;
        else
            size = l1;
        
        for(int i=0;i<size;i++){
            if(a.charAt(i) != b.charAt(i))return false;
        }

        for(int i=0;i<size;i++){
            if(a.charAt(l1-i-1) != b.charAt(l2-i-1))return false;
        }

        return true;
    }
}