class Solution {
    public int numMusicPlaylists(int n, int goal, int k) {
        int mod = (int)(1e9)+7;
        long[][] dp = new long[goal+1][n+1];
        dp[0][0] = 1;
        for(int i = 1 ; i <= goal ;i++){
            for(int j = 1; j <= Math.min(i,n); j++){
//                 if we can choose the new song;
                long add = 0;
                add = ((n-j+1) * dp[i-1][j-1] )% mod;
//                 if we chose old song;
                if(j > k)
                add+= ( dp[i-1][j] * (j-k) + dp[i][j] )%mod;
                add%=mod;
                dp[i][j] = add;
            }
        }
        return (int)dp[goal][n];
    }
}