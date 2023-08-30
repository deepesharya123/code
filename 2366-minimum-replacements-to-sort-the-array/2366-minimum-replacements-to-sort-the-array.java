class Solution {
    public long minimumReplacement(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int i = n-2; i >=0 ;i--){
            if( nums[i] <= nums[i+1] ){
                continue;
            }
            long elements = (long)(nums[i]+ nums[i+1] -1) / (long)nums[i+1];
            ans+=elements-1;
            nums[i] = nums[i] / (int) elements;
        }
        return ans;
    }
}