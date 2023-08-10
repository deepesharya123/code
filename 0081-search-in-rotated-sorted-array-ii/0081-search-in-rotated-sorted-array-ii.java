class Solution {
    public boolean search(int[] nums, int target) {
       int n = nums.length, i = 0, j = n-1;
        while( i <=j ){
            int mid = i+ (j-i)/2;
            if(nums[mid] == target || nums[i] == target || nums[j] == target)
                return true;
            
            
            if(nums[mid] == nums[i] && nums[i] == nums[j] ){
                i++;
                j--;
                continue;
            }
            
            else if(nums[i] <= nums[mid]){
                if(target < nums[mid] && target >= nums[i])
                    j = mid-1;
                else
                    i = mid+1;
            }else{
                if(target > nums[mid] && target <= nums[j])
                    i = mid+1;
                else
                    j = mid-1;
            }
            
        }
        return false;
        
    }
}

