class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++ ){
            if( nums[i] < 1 ) 
                nums[i] = n + 2;
        }
        
        int ans = 0;
        for(int i = 0 ; i < n ; i++ ){
            int val = Math.abs(nums[i]);
            if( val > n ){
                continue;
            }
            nums[val-1] = Math.abs(nums[val-1]) *-1;
        }
        for(int i = 0 ; i < n ; i++ )
            if( nums[i] > 0 )
                return i+1;
        return n+1;
    }
}