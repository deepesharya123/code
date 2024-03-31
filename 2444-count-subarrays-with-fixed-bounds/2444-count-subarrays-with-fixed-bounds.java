class Solution {
    public long countSubarrays(int[] nums, int mink, int maxk) {
        int n = nums.length, i = 0 , j = 0  ;
        int mni = - 1, mxi = -1;
        long ans = 0;

        while( j < n ){
            int num = nums[j];
            if( num < mink || num > maxk ){
                i = j +1;
                mni = -1;
                mxi = -1;
                j++;
                continue;
            }
            
            if( mink == num ){
                mni = j;
            }
            if( maxk == num ){
                mxi = j;
            }
            if( mni >= 0 && mxi >= 0 ){
                ans+=Math.max( 0L, Math.min(mni , mxi) - i+1 );
            }
            j++;
        }
        
        return ans;
    }
}