class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)    return 0;
            
        int i = 0, j = 0, n = nums.length;
        int ans = 0;
        long product = k > 0 ? 1 : 0;
        while(j < n){
            int num = nums[j];
            product*=num;
            while( product >= k)
                product/=nums[i++];
            ans+=(j-i+1);
            j++;
        }
        
        return ans;
    }
}