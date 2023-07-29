class Solution {
    int[][] variation = {{100,0}, {75,25}, {50,50},{25,75}};
    double[][] dp = new double[4004][4004];
    
    public double solve(int a, int b){
        if( a <= 0 && b<=0 )
            return 0.5;
        
        if(a <= 0)
            return 1.0;
        
        if(b <= 0)
            return 0.0;
        
        if(dp[a][b] != -1)
            return dp[a][b];
        
        double ret = 0;
        for(int[] ar : variation){
            int a_serve = ar[0], b_serve = ar[1];
            ret+=solve(a-a_serve, b-b_serve);
        }
        ret*=0.25;
        dp[a][b] = ret;
        return ret;
    }
    
    public double soupServings(int n) {
        if( n > 4000)
            return 1.0;
        for(double[] ar:dp)
            Arrays.fill(ar,-1);
        return solve(n,n);
    }
}