class Solution {
    
    int[] dp ;
    public int solve(int[] nums, int target){
        if(target == 0)
            return 1;
        int n = nums.length;

        if(dp[target] != -1)
            return dp[target];
        int ret = 0;
        for(int i = 0; i < n ; i++){
            if(nums[i] > target)
                break;
            int temp = solve(nums, target - nums[i]);
            ret+=temp;
        }
        dp[target] = ret;
        return ret;
    }
    
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        dp = new int[1005];
        Arrays.fill(dp,-1);
        return solve(nums, target);
    }
}

