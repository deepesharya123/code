class Solution {
    int[] dp;
    
    public int solve(String colors, int[] time, int ind){
        int n = colors.length();
        if( ind >= n )
            return 0;
        
        if( dp[ind] != -1)
            return dp[ind];
        
        int ret = 0;
        int same = -1;
        int sum = time[ind], mx = time[ind];
        for(int i = ind + 1 ; i < n ; i++ ){
            if( colors.charAt(ind) == colors.charAt(i) ){
                same = i;
                sum+=time[i];
                mx = Math.max(mx, time[i]);
            }
            else
                break;
        }
        if( same > 0 ){
            int remove = sum - mx;
            ret+=remove;
            ret+=solve(colors, time, same+1);
        }else
            ret+=solve(colors, time, ind+1);
        dp[ind] = ret;
        return ret;
        
    }
    
    
    public int minCost(String colors, int[] neededTime) {
        dp = new int[colors.length()];
        Arrays.fill(dp,-1);
        int ans = solve(colors, neededTime ,0 );
        
        return ans;
    }
}