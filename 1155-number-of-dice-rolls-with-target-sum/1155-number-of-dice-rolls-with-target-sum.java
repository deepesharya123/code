class Solution {
    
    int[][] dp ;
    int mod = (int)(1e9 + 7);
    public int solve(int n, int k, int target,int ind){
        if( ind >= n )
            return target == 0 ? 1 : 0 ;
        
        if( dp[target][ind] != -1)
            return dp[target][ind];
        
        int ret = 0;
        for(int i = 1 ; i <= k ; i++ ){
            // dice[ind] = i;
            if( i > target )
                break;
            ret+=solve(n, k, target - i  , ind+1);
            ret%=mod;
        }
        dp[target][ind] = ret;
        return ret;
    }
    
    public int numRollsToTarget(int n, int k, int target) {
        dp = new int[1003][33];
        for(int[] ar : dp)
            Arrays.fill(ar,-1);
        int ans = solve(n,k, target, 0);
        return ans;
    }
}