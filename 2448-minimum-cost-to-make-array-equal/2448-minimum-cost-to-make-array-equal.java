class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int[][] numsAndCost = new int[n][2];
        int i = 0;
        for(i = 0; i <n ; i++){
            numsAndCost[i][0] = nums[i];
            numsAndCost[i][1] = cost[i];
        }
        Arrays.sort(numsAndCost, (a,b) -> a[0] - b[0]);
        long[] prefixCostSum = new long[n];
        prefixCostSum[0] = numsAndCost[0][1];
        for(i = 1; i <n;i++){
            prefixCostSum[i] = prefixCostSum[i-1] + numsAndCost[i][1];
        }
        long ans = Integer.MAX_VALUE, temp = 0;
        for(i = 0 ; i < n; i++){
            temp +=(1l) * numsAndCost[i][1] *(numsAndCost[i][0] -numsAndCost[0][0]); 
        }
        ans = temp;
        
        for(i = 1; i < n; i++){
            int dif = numsAndCost[i][0] - numsAndCost[i-1][0];
//             add the left cost 
            temp += (prefixCostSum[i-1] * dif);
            temp -= (prefixCostSum[n-1] -prefixCostSum[i-1])*dif;
            ans = Math.min(ans, temp);
        }
        return ans;
    }
}