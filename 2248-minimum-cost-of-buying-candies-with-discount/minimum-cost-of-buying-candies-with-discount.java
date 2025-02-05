class Solution {
    public int minimumCost(int[] cost) {
        int taken = 0;
        Arrays.sort(cost);
        int n = cost.length;
        int sum = 0;
        for(int i=n-1;i>=0;i--) {
            if(taken == 2)
                taken = 0;
            else{
                sum += cost[i];
                taken++;
            } 
        }

        return sum;
    }
}