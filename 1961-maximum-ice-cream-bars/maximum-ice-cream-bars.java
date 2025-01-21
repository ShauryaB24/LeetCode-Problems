class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0;
        int ans=0;
        
        while(i < costs.length && coins >= costs[i]){
            coins -= costs[i];
            i++;
            ans++;
        }

        return ans;
    }
}