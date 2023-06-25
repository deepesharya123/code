class Solution {
    int mod = (int) ((1e9)+7);
    Integer[][] dp = new Integer[104][202];
    public int solve(int curIdx, int[] locations, int finish, int fuel){
        int n = locations.length;
        if(curIdx >= n)
            return 0;
        
        if(dp[curIdx][fuel] != null)
            return dp[curIdx][fuel];
        
        int ret = curIdx == finish ? 1 : 0;
        for(int i = 0 ; i < n ; i++){
            if(i != curIdx){
                int curFuel = fuel - Math.abs(locations[curIdx]-locations[i]);
                if(curFuel < 0)
                    continue;
                
                // if(i == finish)
                //     ret++;
                ret+= (solve(i,locations,finish, curFuel)%mod);
                ret%=mod;
            }
        }
        dp[curIdx][fuel] = ret;
        return ret;
    }
    
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int ans = solve(start, locations, finish, fuel);
        return ans;
    }
}