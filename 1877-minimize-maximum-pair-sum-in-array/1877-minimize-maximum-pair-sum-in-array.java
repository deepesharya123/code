class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0 , j = nums.length - 1, ans = Integer.MIN_VALUE;
        while( i < j ){
            int sum = nums[i++] + nums[j--];
            ans = Math.max(ans, sum);
        }
        
        return ans;
    }
}