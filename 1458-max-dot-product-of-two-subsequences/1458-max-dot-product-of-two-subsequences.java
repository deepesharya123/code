class Solution {
    int[][] dp = new int[503][503];
    
    public int solve(int i, int j, int[] nums1, int[] nums2){
        int n = nums1.length, m = nums2.length;
        if( i >= n || j>= m )
            return Integer.MIN_VALUE;
        
        if( dp[i][j] != -1)
            return dp[i][j];
        
        int ret = Integer.MIN_VALUE;
//         consider multiplying i and jth
        int a = solve(i+1, j+1, nums1, nums2);
        int b = solve( i, j+1, nums1, nums2);
        int c = solve( i+1, j, nums1, nums2);
        int inc = ( nums1[i] * nums2[j] ) + ( a != Integer.MIN_VALUE ? a : 0);
        int dis = Math.max( b != Integer.MIN_VALUE ? b : 0  , c != Integer.MIN_VALUE ? c : 0 );
        
        
        dp[i][j] = ret = Math.max( inc, dis);
        return ret;
    }
    
    public int maxDotProduct(int[] nums1, int[] nums2) {
        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for (int num: nums1) {
            firstMax = Math.max(firstMax, num);
            firstMin = Math.min(firstMin, num);
        }
        
        for (int num: nums2) {
            secondMax = Math.max(secondMax, num);
            secondMin = Math.min(secondMin, num);
        }
        
        if (firstMax < 0 && secondMin > 0) {
            return firstMax * secondMin;
        }
        
        if (firstMin > 0 && secondMax < 0) {
            return firstMin * secondMax;
        }
        
        for(int[] ar : dp)
            Arrays.fill(ar,-1);
        int ans = solve( 0 , 0, nums1, nums2);    
        return ans;
    }
}