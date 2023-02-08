class Solution {
    int[] dp = new int[10005];
    public int solve(int[] nums, int ind){
        if(ind== nums.length-1)
            return 0;
        
        if(dp[ind]!=-1)
            return dp[ind];
        
        int re =(int) (1e7);
        int jumps = nums[ind], k = ind+1;
        while(jumps-->0 && k<nums.length){
            int r = 1+ solve(nums,k);
            k++;
            re = Math.min(re,r);
        }
        dp[ind]=re;
        return re;
    }
    
    public int jump(int[] nums) {
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
}