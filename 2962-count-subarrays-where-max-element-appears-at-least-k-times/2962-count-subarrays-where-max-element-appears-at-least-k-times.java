class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i = 0 ,j =0;
        int  mx = 0, mxc = 0;
        long ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums )
           mx = Math.max(mx, num);
        while( j < n ){
            int num = nums[j];
            
            if( num == mx )
                mxc++;
            
            while( mxc == k ){
                ans+=(n-j);
                int rm = nums[i++];
                if( rm == mx )
                    mxc--;
            }
            j++;
        }
        return ans;
    }
}