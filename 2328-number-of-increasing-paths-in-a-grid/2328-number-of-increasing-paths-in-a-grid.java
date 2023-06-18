class Solution {
    int[][] dp;
    int[] dr = {-1,0,1,0};
    int[] dc = {0,1,0,-1};
    int mod = (int)(1e9 + 7);
    
    public int solve(int[][] grid, int r, int c){
        if(dp[r][c] != 0)
            return dp[r][c];
        
        int n = grid.length, m = grid[0].length;
        
        int ret = 0;
        dp[r][c]++;
        for(int i = 0 ; i < 4;i++){
            int nr = r+dr[i];
            int nc = c+dc[i];
            
            if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[r][c] > grid[nr][nc] ){
                dp[r][c] += solve(grid,nr,nc);
                dp[r][c]%=mod;
            }
        }
        return dp[r][c];
    }
    
    public int countPaths(int[][] grid) {
        int ans = 0, n = grid.length, m = grid[0].length;
        dp = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j =0 ; j < m ; j++){
                solve(grid, i,j);
            }
        }
        for(int[] row : dp){
            for(int num : row){
                ans+=num;
                ans%=mod;
            }
        }
        return ans;
    }
}