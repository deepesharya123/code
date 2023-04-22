class Solution {
    int[][] dp = new int[503][503];
    
    public int solve(String s, String p, int  i, int j ){
        if( i < 0 || j < 0)
            return 0;
    
        if(dp[i][j] != -1)
            return dp[i][j];
        
        char a = s.charAt(i);
        char b = p.charAt(j);
        
        if(a == b)
            dp[i][j] = 1+ solve(s,p,i-1,j-1);
        else
            dp[i][j] = (int) Math.max(solve(s,p,i-1,j), solve(s,p,i,j-1));
        
        return dp[i][j];
    }
    
    public int minInsertions(String s) {
        String p = "";
        for(char c : s.toCharArray())
            p=c+p;
        for(int i = 0 ;i <= s.length(); i++)
            Arrays.fill(dp[i],-1);
        return s.length()-solve(s,p,s.length()-1,p.length()-1);
    }
}