class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, i = 0 , j=0;
        int[] ans = new int[n];
        j = n-1;
        ans[j] = nums[j];
        j--;
        while(j>=i){
            ans[j] = nums[j]*ans[j+1];
            j--;
        }
        int left = 1;
        int prod = 1;
        for(i = 0;i <n-1;i++){
            ans[i] = left*ans[i+1];
            left *= nums[i];
            prod*=nums[i];
        }
        ans[i] = prod;
        return ans;
    }
}