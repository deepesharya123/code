class Solution {
    int[][] dp;
    public int solve(int ind, int rem, int[] cost, int[] time){
        if( rem <= 0)
            return 0;
        int n = cost.length;
        if( ind == n)
            return (int)1e9;
        if(dp[ind][rem] != 0)
            return dp[ind][rem];
        
        int ret = 0;
        
        int painted = cost[ind] + solve(ind+1, rem - time[ind] - 1, cost, time);
        int dontpaint = solve(ind+1, rem, cost, time);
        // ret = Math.min(painted, dontpaint);
        dp[ind][rem] = Math.min(painted, dontpaint);
      //  System.out.println(painted+"  $   "+dontpaint);
        return Math.min(painted, dontpaint);
    }
    
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        dp = new int[n+3][n+3];
        // for(int[] ar: dp)
        //     Arrays.fill(ar,-1);
        int ans = solve(0,n, cost, time);
        System.out.println(ans);
        return ans;
    }
}

/*
[1,2,3,2]
[1,2,3,2]
[2,3,4,2]
[1,1,1,1]
[4,5,6,2,1,3]
[4,5,6,2,1,3]

*/