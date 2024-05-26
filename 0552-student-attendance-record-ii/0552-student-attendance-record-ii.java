class Solution {
    
    int mod = (int)(1e9)+7;
    int[][][] dp;
    public int solve(int n , int totalAbsent , int consecutiveLates){
        if( totalAbsent >= 2 || consecutiveLates >= 3 )
            return 0;
        if (n == 0) {
            return 1;
        }
        if( dp[n][totalAbsent][consecutiveLates] != -1 )
            return dp[n][totalAbsent][consecutiveLates];
        
        int ret = 0;
//      consider p now
        ret += solve(n - 1, totalAbsent,0) ;
        ret %=mod;
        
//      consider absent now
        ret += solve(n -1 , totalAbsent + 1 , 0 ) ;
        ret %=mod;
        
//      consider late now
        ret += solve(n -1 ,totalAbsent, consecutiveLates+1) ;
        ret %=mod;
        
        dp[n][totalAbsent][consecutiveLates] = ret;
        return ret;
    }
    
    public int checkRecord(int n) {
        dp = new int[n+3][3][3];
        for(int[][] mat : dp ){
            for(int[] ar : mat ){
                Arrays.fill(ar, -1);
            }
        }
        
        return solve(n , 0 ,0);    
    }
}