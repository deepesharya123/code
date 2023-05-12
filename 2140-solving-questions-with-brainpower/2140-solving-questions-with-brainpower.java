class Solution {
    public long mostPoints(int[][] questions) {
        long ans = 0;
        int n = questions.length;
        long[] dp = new long[n+2];
        dp[n] = dp[n+1] = 0;
        for(int i = n -1; i >= 0;i--){
            long points = questions[i][0];
            int skip = questions[i][1];
            
            long inc = points, dis = 0;
            if(i+skip+1 < dp.length)
            inc+=dp[i+skip+1];
            dis+=dp[i+1];
            dp[i] = Math.max(inc,dis);
            ans = Math.max(dp[i], ans);
        }
        return ans; 
    }
}