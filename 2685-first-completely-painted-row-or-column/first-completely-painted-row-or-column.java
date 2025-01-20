class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        Map<Integer, int[]> mp = new HashMap<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                mp.put(mat[i][j], new int[]{i, j});
            }
        }

        int[] r_c = new int[r];
        int[] c_c = new int[c];

        for(int i=0;i<arr.length;i++){
            int[] p = mp.get(arr[i]);
            r_c[p[0]]++;
            c_c[p[1]]++;
            if(r_c[p[0]] == c || c_c[p[1]] == r)return i;
        }

        return arr.length-1;
    }
}