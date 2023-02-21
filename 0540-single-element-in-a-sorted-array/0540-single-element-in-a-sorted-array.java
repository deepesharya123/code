class Solution {
    
    public static int solve(int[] nums,int s,int e){
        int ans = -1;
        
        while(s<=e){
            int mid = s+((e-s)/2);
            int dif = e-mid;
            
            int cs = s,ce=e;
            
            if(dif%2!=0){
                if((mid+1<nums.length && nums[mid+1]==nums[mid])){
                    e=mid-1;
                }
                else if(mid-1>=0 && nums[mid-1]==nums[mid]){
                    s=mid+1;
                }
            }else{
                 if((mid+1<nums.length && nums[mid+1]==nums[mid])){
                    s=mid+1;
                }
                else if(mid-1>=0 && nums[mid-1]==nums[mid]){
                    e=mid-2;
                }
            }
            if(cs==s&&ce==e){
                ans = nums[mid];
                break;
            }
            
        }
        
        return ans;
    }
    
    public int singleNonDuplicate(int[] nums) {
        return solve(nums,0,nums.length-1);
    }
}