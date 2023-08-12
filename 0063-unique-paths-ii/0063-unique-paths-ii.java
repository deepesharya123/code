class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length ,m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        int i = 0 , j = 0;
        for(i = 0 ; i < n ; i++){
            for(j = 0 ; j < m; j++){
                if(obstacleGrid[i][j] == 1)
                     dp[i][j] = -1;
            }
        }
        
        dp[0][0] = obstacleGrid[0][0] != 1 ? 1 : 0;
        for(i =0 ; i < n ;i++){
            for(j = 0;j <m;j++){
                if(dp[i][j] == -1)
                    continue;
                if(i-1 >= 0 && dp[i-1][j] != -1)
                    dp[i][j] += dp[i-1][j];
                if(j-1 >= 0 && dp[i][j-1] != -1)
                    dp[i][j] += dp[i][j-1];
            }
        }
        return dp[n-1][m-1]!=-1 ? dp[n-1][m-1] : 0;
    }
}