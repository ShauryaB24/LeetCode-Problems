class Solution {
    public int reverse(int x) {
        int n = x;
        
        long result = 0;
        while(n!=0) {
            int d = n%10;
            result = result * 10 + d;
            n = n/10;
        }

        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;
        return (int)result;
    }
}