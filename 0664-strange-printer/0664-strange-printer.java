class Solution {
    int[][] dp = new int[108][108];
    public int solve(String s, int start, int end){
        if(dp[start][end] != -1)
            return dp[start][end];
        int j = -1;
        int res = s.length();
        for(int i= start ; i < end; i++){
            if(s.charAt(i) != s.charAt(end) && j == -1)
                j = i;
            
            if(j != -1)
                res = Math.min(res, 1 + solve(s,j,i) + solve(s,i+1,end));
        }
        if(j == -1)
            res = 0;
         dp[start][end] = res;
        return res;
    }
    
    public int strangePrinter(String s) {
        for(int[] ar : dp)
            Arrays.fill(ar,-1);
    return solve(s, 0, s.length()-1)+1;    
    }
}