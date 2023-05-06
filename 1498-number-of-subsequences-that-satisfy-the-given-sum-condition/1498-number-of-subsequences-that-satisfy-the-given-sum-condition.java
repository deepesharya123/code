class Solution {
    public int numSubseq(int[] nums, int target) {
        int ans = 0 ;
        int n = nums.length;
        Arrays.sort(nums);
        int mod = (int) 1e9;
        mod+=7;
        int[] pow = new int [n];
        pow[0] = 1;
        int i = 0, j = 0;
        for( i = 1; i < n ; i++)
            pow[i] = (pow[i-1] *2)%mod;
        i = 0;
        j = n-1;
        while(i <= j){
            if(nums[i] + nums[j] <= target){
                int add = pow[j - i];
                add%=mod;
                ans= (ans+add)%mod;
                i++;
            }else
                j--;
        }
        return ans;
    }
}