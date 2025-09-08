class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x); 
        char[] a = s.toCharArray();
        int l = 0;
        int r = a.length - 1;

        while(l<r){
            if(a[l] != a[r])
                return false;

            l++;
            r--;
        }

        return true;
    }
}