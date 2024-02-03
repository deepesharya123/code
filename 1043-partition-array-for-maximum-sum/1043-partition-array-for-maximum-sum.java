class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        long[] dp = new long[n];
        dp[0] = arr[0];
        int i = 0;
        int mx = arr[0];
        for(i = 1 ; i < k; i++){
            mx = Math.max(mx, arr[i]);
            dp[i] = (i+1) *(mx);
        }
        
        for(i = k ; i < n; i++){
            mx = arr[i];
            int j = i-1;
            long s1 = 0;
            long s2 = arr[i] + dp[i-1];
            while( i - j <k ){
                mx = Math.max(mx, arr[j]);
                s1 = Math.max(s1, dp[j-1] + (i-j+1) * mx );
                // if(j == i-1)
                //   System.out.println(s1+" "+s2);  
                j--;
            }            
            dp[i] = Math.max(s1,s2);
        }
        for(long num : dp)
            System.out.println(num +" ");
        return (int)dp[n-1];
    }
}
