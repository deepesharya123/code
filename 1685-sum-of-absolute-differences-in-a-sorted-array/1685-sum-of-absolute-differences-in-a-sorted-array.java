class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0, tot = 0;
        for(int i = 0 ; i < n ; i++)
            tot+=nums[i];
        
        for( int i = 0 ; i < n ; i++){
            int right = 0, left = 0;
            sum+=nums[i];
            right = Math.abs((tot - sum) - (n-1-i)*nums[i]);
            if( i-1 >= 0 )
                left = Math.abs( (sum-nums[i]-( i * nums[i] )));
            ans[i] = right + left;
        }
        return ans;
    }
}