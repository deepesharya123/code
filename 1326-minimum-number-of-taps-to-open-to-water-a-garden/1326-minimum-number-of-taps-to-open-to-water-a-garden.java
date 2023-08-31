class Solution {
    long[] dp = new long[10004];
    
    public long solve(int ind, int[][] intervals){
        int len = intervals.length;
        
        if(intervals[ind][1] >= len-1)
            return 1;
        if(ind >= len)
            return Integer.MAX_VALUE;
        
        
        if(dp[ind] != -1)
            return dp[ind];
        
        long ret = Integer.MAX_VALUE;
        for(int i = ind + 1  ; i < len; i++){
            if(intervals[i][0] > intervals[ind][1])
                break;
            ret = Math.min(ret, 1 + solve(i,  intervals));
           
        }
        dp[ind] = ret;
        return ret;
    }
    
    public int minTaps(int n, int[] ranges) {
        int[][] intervals = new int[n+1][2];
        int i = 0 ;
        for(i = 0 ; i <= n; i++){
            // intervals[i][0] = Math.max(0, i - ranges[i]);
            // intervals[i][1] = Math.min(n, i + ranges[i]);
            intervals[i][0]  = i-ranges[i];
            intervals[i][1] = i+ranges[i];
        }
        
        long ans = Integer.MAX_VALUE;
        Arrays.fill(dp,-1);
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        for(i = 0 ; i <= n; i++){
            if(intervals[i][0] <= 0){
                ans = Math.min(ans, solve(i, intervals));
            }
        }
        return (int)(ans == Integer.MAX_VALUE ? -1 : ans);
    }
}

/*



5
[3,4,1,1,0,0]


*/