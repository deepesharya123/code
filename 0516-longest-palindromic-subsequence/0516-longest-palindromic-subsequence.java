class Solution {
    int[][] dp = new int[1002][1002];
    public int solve(String s, int start, int end){
        if(dp[start][end] != 0)
            return dp[start][end];
        
        if(start > end)
            return 0;
        if(start == end )
            return dp[start][end] = 1;
        
        if(s.charAt(start) == s.charAt(end)){
            return dp[start][end] =  2 + solve(s, start+1, end - 1);
        }else{
            int ret = (int) (Math.max(solve(s , start+1,end), solve(s, start, end-1)));
            return dp[start][end] =  ret;
        }
    }
    
    public int longestPalindromeSubseq(String s) {
        int start = 0, n = s.length()-1 , end = n;
        return solve(s, start, end);
    }
}