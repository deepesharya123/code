class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int n = prices.length;
        int[] m=new int[n];
        int max=prices[n-1];
        for(i=n-1;i>=0;i--) {
           max = Math.max(max,prices[i]);
            m[i]=max;
        }
        int ans =0;
        for(i=0;i<n;i++){
            ans =Math.max(ans,m[i]-prices[i]);
        }
        
        return ans;
        
    }
}