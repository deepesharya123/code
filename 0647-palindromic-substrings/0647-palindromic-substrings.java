class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][]  dp = new int[n+3][n+3];
        
//      for length 1
        for(int i = 0 ; i < n ; i++ )
            dp[i][i] = 1;
        
//         for length 2
        for(int i = 0 ; i < n-1 ; i++ ){
            if( s.charAt(i) == s.charAt(i+1) ) 
                dp[i][i+1]++;
        }
            
//         for length >= 3 to n
        for(int len = 3 ; len <= n ; len++){
            for(int i = 0 ; i < n-len+1 ; i++ ){
                int st = i, e = i + len-1;
                if( s.charAt(st) != s.charAt(e))
                    continue;
                if( dp[st+1][e-1] ==1 )
                    dp[st][e] = 1;
            }
        }
        
        int ans = 0;
        for(int[] ar : dp){
            for(int num : ar)
                ans+=num;
        }
        
        return ans;
    }
}