class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = nums[0];
        for(int i = 1 ; i < nums.length; i++ )
            xor ^= nums[i];
        
        int ans = 0 ;
        while( k > 0 || xor > 0 ){
            if( k %2  != xor %2 )
                ans++;
            
            k/=2;
            xor/=2;
        }
        
        return ans;
    }
}