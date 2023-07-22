class Solution {
    
    int[] dr = { -2, -2, -1, 1, 2, 2, 1, -1 };
    int[] dc = { -1, 1, 2, 2, 1, -1, -2, -2 };
    
    double[][][] dp;
    
    public double solve(int n, int k, int row, int col){
        if(row < 0 || row >= n || col >= n || col < 0)
            return 0;
        if( k == 0)
            return 1;
        
        if(dp[row][col][k] != -1)
            return dp[row][col][k];
        
        double prob = 0;
        for(int i = 0; i < 8;i++){
            double add = ((solve(n, k - 1 , row + dr[i], col + dc[i] )) /8.0);
            prob+=add;
        }
        return dp[row][col][k] = prob;
    }
    
    public double knightProbability(int n, int k, int row, int column) {
        double ans = 1;
        dp = new double[n+2][n+2][k+2];
        for(double[][] mat : dp)
            for(double[] ar : mat)
                Arrays.fill(ar,-1);
        return solve(n,k,row,column);
        // return ans;
    }
}

