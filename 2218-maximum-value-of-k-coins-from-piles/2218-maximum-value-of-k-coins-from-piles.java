class Solution {
    int[][] dp;
    
    public int  solve(List<List<Integer>> piles, int ind, int k){
        int n = piles.size();    
        if( ind < 0 || k == 0)
            return 0;
        
        if(dp[ind][k] != 0)
            return dp[ind][k];
        
        int discard = solve(piles, ind-1, k);
        int sum = 0 , include = 0;
        int mn = Math.min(piles.get(ind).size() , k);
        for(int j = 0;j < mn ; j++){
            sum+=piles.get(ind).get(j);
            include = Math.max(include, sum + solve(piles, ind-1, k- j -1));
        }
        dp[ind][k] = Math.max(include, discard);
        return dp[ind][k];
        
    }
    
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();
        dp = new int[n+1][k+1];
        return solve(piles,n -1, k);        
    }
}