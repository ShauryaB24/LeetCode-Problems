class Solution {
    public int countPrimes(int n) {
        if(n<3)return 0;
        int res=0;
        boolean[] dp = new boolean[n+1];

        for(int i=0;i<=n;i++){
            dp[i] = true;
        }

        for(int i=2;i*i<=n;i++){
            if(dp[i] == true){
                for(int j=i*i;j<=n;j+=i){
                    dp[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (dp[i] == true)
                res++;
        }

        return res;

    }
}