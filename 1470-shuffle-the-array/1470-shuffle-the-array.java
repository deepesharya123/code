class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i = 0, j=n;
        int k = 0;
        while(j<2*n){
            ans[k++] = nums[i++];
            ans[k++] = nums[j++];
        }
        
        return ans;
    }
}