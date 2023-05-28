class Solution {
    
    HashMap<String,Integer> dp = new HashMap();
    
    public int solve(int s , int e, int[] cuts){
        int c = cuts.length;
        if(e-1 == s)
            return 0;
    
        String key = s +","+e;
        if(dp.containsKey(key))
            return dp.get(key);
        
        int i = 0, ret = Integer.MAX_VALUE;
        for(i= 0;i<c;i++){
            if(cuts[i] > s && cuts[i] < e ){
                int inc = (e-s) + solve(s, cuts[i], cuts) + solve(cuts[i], e, cuts);
                ret = Math.min(inc, ret);
            }
        }
        ret = ret == Integer.MAX_VALUE ? 0: ret;
        dp.put(key,ret);
        return ret ;
    }
    
    public int minCost(int n, int[] cuts) {
        int ans = solve(0, n, cuts);
        return ans;
    }
}