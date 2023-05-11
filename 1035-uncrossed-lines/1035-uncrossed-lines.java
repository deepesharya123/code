class Solution {
    int ans = 0;
    int[][] dp = new int[503][503];
    
    public int solve(int[] nums1, int[] nums2, int ind1, int ind2){
        if(ind1 == nums1.length || ind2 == nums2.length)
            return 0;
        
        if(dp[ind1][ind2] != -1)
            return dp[ind1][ind2];
        
        int ret = 0;
        for(int i = ind2; i < nums2.length ; i++){
            int num = nums2[i];
            int inc = 0, dis = 0;
            int a = solve(nums1, nums2, ind1, i+1);
            int b = solve(nums1, nums2, ind1+1, i);
            int c = solve(nums1, nums2, ind1 +1, i+1);
            
//             include 
            if(nums1[ind1] == num ){
                inc = c+1;
            }else
                dis = Math.max(b,c);
            ret = Math.max(ret,Math.max(inc,dis));
        }
        
        return dp[ind1][ind2] = ret;
    }
    
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        for(int[] ar: dp)
            Arrays.fill(ar, -1);

        ans = Math.max(ans, solve(nums1, nums2, 0, 0 ));
        
        return ans;
    }
}

/*

[1,4,2]
[1,2,4]
[2,5,1,2,5]
[10,5,2,1,5,2]
[1,3,7,1,7,5]
[1,9,2,5,1]



*/