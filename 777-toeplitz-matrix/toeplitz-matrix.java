class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<m-1; j++){
                int e = matrix[i][j];
                if(i<n-1 && j<m-1 && matrix[i+1][j+1] != e)return false;
            }
        }

        return true;
    }
}