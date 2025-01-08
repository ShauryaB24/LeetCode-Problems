class Solution {
    public int[][] transpose(int[][] matrix) {
        int ro = matrix.length;
        int col = matrix[0].length;
        int[][] res = new int[col][ro];

        for (int r = 0; r < ro; r++) {
            for (int c = 0; c < col; c++) {
                res[c][r] = matrix[r][c];
            }
        }

        return res;        
    }
}