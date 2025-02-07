class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n=queries.length;
        int[] res=new int[n];
        Map<Integer,Integer> balls=new HashMap<>();
        Map<Integer,Integer> colors=new HashMap<>();
        for(int i=0;i<n;i++){
            int ball=queries[i][0], color=queries[i][1];
            if(balls.containsKey(ball)){
                int oldColor=balls.get(ball);
                if(oldColor!=color){
                    int oldColorFre=colors.get(oldColor);
                    if(oldColorFre-1>0){
                        colors.put(oldColor,oldColorFre-1);
                    }else{
                        colors.remove(oldColor);
                    }
                }else{
                    res[i]=colors.size();
                    continue;
                }
            }
            balls.put(ball,color);
            int fre=0;
            if(colors.containsKey(color)){
                fre+=colors.get(color);
            }
            colors.put(color,fre+1);
            res[i]=colors.size();
        }
        return res;        
    }
}