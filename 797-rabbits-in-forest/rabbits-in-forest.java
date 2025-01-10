class Solution {
    public int numRabbits(int[] arr) {
        int l = arr.length;
        int ans = 0;
        int[] g = new int[1001];
        for(int i = 0;i<l;i++){
                int n = arr[i]+1;
                if(g[n]>0){
                    g[n]--;
                }
                else{
                    ans+=n;
                    g[n] = n-1;
                }

            }
        
        return ans;
    }
}