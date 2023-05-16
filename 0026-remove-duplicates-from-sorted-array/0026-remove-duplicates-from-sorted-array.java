class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, actuali = 0;
        for(i = 1; i < n ;i++){
            if(nums[actuali] == nums[i])
                continue;
            nums[++actuali] = nums[i];
        }
        return actuali+1;
    }
}