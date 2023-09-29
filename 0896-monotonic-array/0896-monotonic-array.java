class Solution {
    
    public void reverse(int[] nums){
        int n = nums.length;
        int i = 0 , j = n-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
    public boolean increase(int[] nums){
        int n = nums.length;
        int i = 0, prev = nums[0];
        for( i = 1 ; i < n ; i++){
            int num = nums[i];
            if( num < prev)
                return false;
            prev = num;
        }
        return true;
    }
    
    public boolean isMonotonic(int[] nums) {
        boolean inc = increase(nums);
        reverse(nums);
        boolean dis = increase(nums);
        return inc || dis;
    }
}