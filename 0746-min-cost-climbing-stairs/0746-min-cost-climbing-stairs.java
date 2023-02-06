class Solution {
    int[] dp = new int[1001];
    
    public int solve(int[] cost,int ind){
        if(ind<2){
            return 0;
        }
        
        if(dp[ind]!=-1)
            return dp[ind];
        
        int res = Integer.MAX_VALUE;
        if(ind-1>=0){
            res = cost[ind-1] + solve(cost,ind-1);
        }
        
        if(ind-2>=0){
            res = Math.min(res,cost[ind-2]+solve(cost,ind-2));
        }
        dp[ind] = res;
        return res;
        
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int ans = Integer.MAX_VALUE, temp = 0;
        int n = cost.length;
        Arrays.fill(dp,-1);
        ans = solve(cost,n);
        
        return ans;
    }
}