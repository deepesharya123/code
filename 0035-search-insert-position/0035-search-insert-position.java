class Solution {
    
    public int binarySearch(int[] nums, int target){
        int i =0, j= nums.length-1;
        int ans = -1;
        while(i<=j){
            int mid = (j+i)/2;
            if(nums[mid]<target){
                ans = mid;
                i = mid+1;
            }else if(nums[mid]==target)
                return mid;
            else{
                j = mid-1;
            }
        }
        
        return ans+1;
    }
    
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,target);
    }
}