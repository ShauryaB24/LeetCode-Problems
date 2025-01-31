class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length,m = grid[0].length;

        HashMap<Integer,Integer> hm = new HashMap<>();
        int c =2,ans=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    int t = preCount(i,j,grid,n,m,c);
                    hm.put(c,t);
                    c++;
                    ans = Math.max(ans,t);
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                {
                    int t = connect(i,j,grid,hm,n,m);
                    ans = Math.max(ans,t);
                }
            }
        }

        // Return the Answer
        return ans;

    }

    public int connect(int i,int j,int[][] g,HashMap<Integer,Integer> hm,int n,int m)
    {
        if(i<0 || i>=n || j<0 || j>=m) return 0;

        int t = 1;
        int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        Set<Integer> s = new HashSet<>();

        for(int k[] : dir)
        {
            int r = i+k[0] , c = j + k[1];
            if(r>=0 && r<n && c>=0 && c<m && !s.contains(g[r][c]) && hm.containsKey(g[r][c]))
            {
                s.add(g[r][c]);
                t += hm.get(g[r][c]);
            }
        }
        return t;
    }

    public int preCount(int i,int j,int[][] g,int n,int m,int c)
    {
        if(i<0 || i>=n || j<0 || j>=m)
        {
            return 0;
        }

        g[i][j] = c;
        int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int ans = 1;
        for(int k[] : dir)
        {
            int r = i + k[0], nc = j + k[1];
            if(r>=0 && r<n && nc>=0 && nc<m && g[r][nc]==1)
            {
                    ans += preCount(r,nc,g,n,m,c);
            }
        }
        return ans;
    }
}