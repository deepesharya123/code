class Solution {
    static int[] t ;
    public static boolean solve(int n, int[] nums){
        if(n<=0)
            return true;
        boolean  ans = false;
        if(t[n]!=-1){
            if(t[n]==0)
                return false;
            return true;
        }
            
        int j=n-1;
        while(j>=0&&n-nums[j]>j){
            j--;
        }
        if(j<0)
            return ans;
        int num = nums[j];
        while(nums[j]+j>=n){
            ans = ans|solve(j,nums);
            j--;
            if(ans)
                return ans;
        }
        t[n]=ans?1:0;
        return ans;
    }
    
    public boolean canJump(int[] nums) {
        boolean ans = false;
        t = new int[nums.length+2];
        for(int i=0;i<nums.length;i++)
            t[i]=-1;
        ans = ans|solve(nums.length-1,nums);
        
        return ans;
    }
}