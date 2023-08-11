class Solution {
    int[][] dp ;
    
    public int solve(int target, int[] coins, int ind){
        
        if(target == 0)
            return 1;
        if(ind < 0 || target < 0 )
            return 0;
        
        if(dp[target][ind] != -1)
            return dp[target][ind];
        
        int n = coins.length;
        int ret = Integer.MIN_VALUE, inc = Integer.MIN_VALUE, dis = Integer.MIN_VALUE;
        
        dis = solve(target,coins,ind-1);
        
        inc = solve(target - coins[ind] , coins, ind);
        
        ret = inc+dis;
        dp[target][ind] = ret;
        return ret;
    }
    
    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new int[amount+5][n+5];
        for(int[] ar : dp)
            Arrays.fill(ar,-1);
        
        return solve(amount, coins,n-1);    
    }
}