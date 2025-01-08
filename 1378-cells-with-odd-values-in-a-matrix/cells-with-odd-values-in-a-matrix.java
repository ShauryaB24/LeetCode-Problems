class Solution{
    public int oddCells(int n, int m, int[][] indices) {
        int[] rows = new int[n]; 
        int[] columns = new int[m]; 
        
        for(int i = 0; i < indices.length; i++){
            rows[indices[i][0]] += 1;   
            columns[indices[i][1]] += 1; 
        }
        
        int odds = 0;
        for(int i = 0; i < rows.length; i++){
            for(int j = 0; j < columns.length; j++){
                if((rows[i] + columns[j]) % 2 != 0){ 
                    odds += 1; 
                }
            }
        }
        return odds;
    }
}