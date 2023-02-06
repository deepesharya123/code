class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0]=dp[1]= 0;
        for(int i =2;i<=n;i++){
            int p1  = cost[i-1]+dp[i-1];
            int p2 = cost[i-2]+dp[i-2];
            dp[i] = Math.min(p1,p2);
        }
        
        return dp[n];
    }
}