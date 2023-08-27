class Solution {
    int[][] dp = new int[2004][2004];
    
    public boolean solve(int[] stones, int ind, int jump){
        int n = stones.length;
        
        if(ind >= n) return false;
        if(ind == n-1) return true;
        int cur = stones[ind];
        boolean ret = false;
    
        if(dp[ind][jump] != -1)
            return dp[ind][jump] == 1;
        
        if(ind == 0){
            if(stones[ind+1] - cur == 1)
            ret = ret | solve(stones, ind+1, 1);
            return ret;
        }
        boolean less_jump = false, equal_jump = false, more_jump = false;
        for(int i = ind + 1 ; i < n ; i++){
            int num = stones[i];
            if(num - cur > jump +1)
                break;
//             check with jump - 1
            if(num - cur == jump-1){
                ret = ret | solve(stones, i , num-cur);
                
            }
            
//             check with jump
            if(num - cur == jump){
                ret = ret | solve(stones, i , num-cur);
            }
            
            
//             check with jump + 1
            if(num - cur == jump +1){
                ret = ret | solve(stones , i , num-cur);
            }

        }
        dp[ind][jump] = ret ? 1 : 0;
        return ret;
        
    }
    
    public boolean canCross(int[] stones) {
        for(int[] ar : dp)
            Arrays.fill(ar , -1);
        return solve(stones, 0,1);
    }
}