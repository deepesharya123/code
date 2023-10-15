class Solution {
    
    int mod = (int)(1e9 + 7);
    HashMap<String,Integer> hm = new HashMap<>();
    
    public int solve(int steps, int n, int  ind, int curStep){
      
        if( ind == 0 && steps == curStep)
            return 1;
        
        if( curStep >= steps)
            return 0;
        String key = ""+ind+"_"+curStep;
        if( hm.containsKey(key))
            return hm.get(key);
        
//      stay at this point
        int ret = solve(steps, n, ind, curStep + 1);
        ret%=mod;
//         move left
        if(ind - 1 >= 0 )
        ret += ( solve(steps, n, ind-1, curStep+1)% mod );
        ret%=mod;
//          move right 
        if( ind+ 1 < n )
        ret += ( solve(steps, n, ind+1, curStep+1) % mod);
        
        ret%=mod;
        // dp[curStep][ind] = ret;
        hm.put(key,ret);
        return ret;
        
    }
    
    public int numWays(int steps, int arrLen) {
        // dp = new int[steps + 3][arrLen+3];
        // for(int[] ar : dp)
        //     Arrays.fill(ar,-1);
        int ans = solve(steps, arrLen, 0, 0 );       
        return ans;
    }
}