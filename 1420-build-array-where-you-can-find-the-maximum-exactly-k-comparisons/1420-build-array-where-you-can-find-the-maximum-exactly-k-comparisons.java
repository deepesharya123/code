class Solution {
    int mod = (int) (1e9 +7);
    int[][][] dp ;    
    public int solve(int n, int idx, int len, int m , int largest,int k){
        if( idx == n){
            return len == k ? 1 : 0;
        }
        if( dp[idx][len][largest] != -1)
            return dp[idx][len][largest];
        
        int ans = 0;
        for(int i = 1 ; i <= m ; i++){
            if( i > largest){
                ans+=solve(n, idx+1, len+1, m, i,k);
            }else
                ans+=solve(n,idx+1, len, m, largest,k);
            ans%=mod;
        }
        ans%=mod;
        return dp[idx][len][largest] = ans;
    }
    
    public int numOfArrays(int n, int m, int k) {
        dp = new int[n+3][n+3][m+3];
        for(int[][] mat : dp)
            for(int[] ar : mat)
                Arrays.fill(ar,-1);
        int ans = solve(n,0,0,m,0,k);    
        return ans;
    }
}