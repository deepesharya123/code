class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int len = 1 , i = 0;
        for(i = 0 ; i < n; i++)
            dp[i][i] = 1;
        
        i = 0;
        while( i +1< n ){
            if( s.charAt(i) == s.charAt(i+1))
                dp[i][i+1] = 2;
            i++;
        }
        
        len = 3;
        while( len <= n){
            for(i = 0 ; i < n - len +1 ; i++){
                int st = i, e = i + len-1;                    
                if( s.charAt(st) == s.charAt(e) && dp[st+1][e-1] > 0 ){
                    dp[st][e] = 2 + dp[st+1][e-1];
                }   
            }
            len++;
        }
        int leng = Integer.MIN_VALUE;
        int ind = -1;
        
        for(i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if( dp[i][j] > leng){
                    leng = dp[i][j];
                    ind = j;
                }
            }
        }
        String ans = "";
        
        while( leng > 0 ){
            ans+=s.charAt(ind);
            ind--;
            leng--;
        }
        return ans;
    }
}

