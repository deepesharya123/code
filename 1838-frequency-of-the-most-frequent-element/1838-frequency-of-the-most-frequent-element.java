class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, i = 0 , n = nums.length;
        int j = 0;
        long sum = 0;     
        // long kk = k ;
        while( j < n ){
            int num = nums[j];
            sum+=num;
            
            
            while( ((j - i +1)*num ) - sum > k ){
                sum-=nums[i++];
            }
            
            ans = Math.max(ans, j-i+1);
            j++;
            
        }
        return ans;
    }
}