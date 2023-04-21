class Solution {
    int ans = 0;
    int mod = (int)(1e9)+7;
    int[][][] dp = new int[103][101][101];
    
    public int solve(int ind, int[] group, int[] profit, int people_left, int benefit, int minProfit){
        
        ans%=(mod);  
        int len = group.length;
       
        if(ind >= len)
            return benefit >= minProfit ? 1 : 0;

        if(dp[ind][people_left][benefit] != -1)
            return dp[ind][people_left][benefit];
        
     
        long ret = 0;
//         discard the current group 
        ret = solve(ind+1, group, profit, people_left , Math.min( benefit,minProfit), minProfit );
        
        if(people_left >= group[ind])
            ret += solve(ind+1, group, profit, people_left - group[ind], Math.min(profit[ind] +benefit,minProfit), minProfit );
         
      
        dp[ind][people_left][benefit] = (int)ret%mod;
        ret%=mod;
        return (int)ret;
    }
        
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        
        for(int i = 0 ; i <= group.length;i++){
            for(int j = 0 ; j <= n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        
        return solve(0,group, profit, n, 0, minProfit);
    }
}