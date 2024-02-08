class Solution {
    int[] dp = new int[10005];
    
    public int solve(int n , int[] ar){
        int sqrt = (int) Math.sqrt(n);
        if( n == 1 || ( ( sqrt * sqrt ) == n) )
            return 1;
        
        if( dp[n] != -1 )
            return dp[n];
        
        int len = ar.length;
        int greatestIndex = 1;
        int ret = Integer.MAX_VALUE;
        for(int i = 1 ; i < len ; i++ ){
            if( ar[i] > n )
                break;
            greatestIndex = i;
            int temp = 1 + solve(n-ar[i],ar);
            ret = Math.min(temp,ret);
        }
        dp[n] = ret;
        return ret;
    }
    
    public int numSquares(int n) {
        int s = (int)Math.sqrt(n + 1 ) ; 
        int[] ar = new int[s+2];
        Arrays.fill(dp,-1);
        for(int i = 0; i < s +2 ; i++ )
            ar[i] = i*i;
        
        return solve(n, ar);
    }
}