class Solution {
    int count = 0;
    int[] dp = new int[46];
    public int climb(int n){
        if(n<3 && n>0){
            return dp[n]=n;
        }
        if(dp[n]!=0)
            return dp[n];
        
        int p1 = climb(n-1);
        int p2 = climb(n-2);
        dp[n] = dp[n-1]+dp[n-2];
        return dp[n];
        
    }
    
    public int climbStairs(int n) {
        
        climb(n);
        return dp[n];
    }
}