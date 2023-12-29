class Solution {
    
    public int maxi(int[] jobDifficulty, int i, int j ){
        int mx = Integer.MIN_VALUE;
        for(int ind = i ; ind <= j ; ind++ )
            mx = Math.max(mx, jobDifficulty[ind]);
        return mx;
    }
    int[][][] dp;
    
    public int solve(int i, int j, int[] jobDifficulty, int d){
        int n = jobDifficulty.length;
        if( ( j - i + 1)  < d )
            return Integer.MAX_VALUE;
        
        if( d == 1 )
            return maxi(jobDifficulty,i,j);
        
        if( dp[i][j][d] != -1 )
            return dp[i][j][d];
        
        int ret = Integer.MAX_VALUE;
        for(int ind = i ; ind <= j-d +1 ; ind++){
            int temp = solve(ind+1,j,jobDifficulty ,d-1);
            if( temp == Integer.MAX_VALUE ) 
                temp = 0;
            temp = maxi(jobDifficulty, i,ind )+ temp;
            // System.out.println(temp);
            ret = Math.min(ret, temp);
        }
        dp[i][j][d] = ret;
        return ret;
    }
    
    public int minDifficulty(int[] jobDifficulty, int d) {
        
        dp = new int[303][303][13];
        for(int[][] mat : dp )
            for(int[] ar : mat)
                Arrays.fill(ar,-1);
        
        int ans = solve(0, jobDifficulty.length-1, jobDifficulty, d );
        if( ans == Integer.MAX_VALUE) 
            ans = -1;
        return ans;
    }
}