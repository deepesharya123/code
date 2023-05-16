class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        int i = 0, j = n-1;
        while( i < j ){
            if(nums[i] + nums[j] == target){
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            }else if( nums[i] + nums[j] < target)
                i++;
            else
                j--;
        }
        
        return ans;
    }
}