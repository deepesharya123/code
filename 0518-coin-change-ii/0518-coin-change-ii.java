class Solution {
    int[][] dp = new int[303][5003];
    
    public int solve(int[] coins, int n, int amount){
        if( n <= 0 )
            return 0;
        if( amount == 0)
            return 1;
        if( dp[n-1][amount] != -1)
            return dp[n-1][amount];
        if( coins[n-1] <= amount ){
            int inc  = solve(coins, n , amount - coins[n-1]);
            int dis = solve(coins, n-1, amount);
            return dp[n-1][amount] = (inc+dis);
        }
        
        return dp[n-1][amount] = solve(coins, n-1, amount); 
        
    }
    
    public int change(int amount, int[] coins) {
        for(int [] ar : dp)
            Arrays.fill(ar, -1);
        return solve(coins, coins.length, amount);
    }
}