class Solution {
    int[][][] dp = new int[2][104][105];
    
    public int solve(boolean alice,int i, int[] piles, int m ){
        int cx = 1 , j = i, ret = alice ? 0 : Integer.MAX_VALUE;
        int sum = 0, n = piles.length;
        if(i >= n)
            return 0;
        
        int zero = alice ? 0 :1;
        
        if(dp[zero][i][m] != -1)
            return dp[zero][i][m] ;
        
        while(j < n && cx <= 2*m){
            sum+=piles[j];
            int got = solve(!alice, j+1,piles,Math.max(m, j-i+1));
            if(alice)
                ret = Math.max(ret, sum+got);
            else
                ret = Math.min(ret, got);
            j++;
            cx++;
        }
        dp[zero][i][m]  = ret;
        return ret;
    }
    
    public int stoneGameII(int[] piles) {
        for(int[][] mat : dp)
            for(int[] ar : mat)
                Arrays.fill(ar, -1);
        int ans = solve(true,0,piles, 1);
        return ans;
    }
}