class Solution {
    
    int[][] cal = {{2,2,2},{3,0,3},{2,2,2},{0,2,0}};    // f(s,1);
    int[][] digits = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
    int mod = ((int)(1e9) + 7);
    int[] dr = {-2,-2,-1,1,2,2,1,-1};
    int[] dc = {-1,1,2,2,1,-1,-2,-2};
    int[][] dp = new int[10][5005];
    
    public int solve(int s, int n){
        if( n == 0 )
            return  1;
        
        int row = (s-1)/3, col = (s-1)%3;
        if( s == 0 ){
            row = 3;
            col = 1;
        }
        
        if( n == 1) 
            return cal[row][col];
    
        if( dp[s][n] != -1 )
            return dp[s][n];
            
        int ret = 0;
        
        for(int i = 0 ; i < 8 ; i++ ) {
            int nr = row+dr[i], nc = col+dc[i];
            if( (nr == 3 && nc == 1) ||  ( nr >= 0 && nr < 3 && nc >= 0 && nc < 3)){
                int temp = solve(digits[nr][nc] , n -1 );
                temp%=mod;
                ret+=temp;
                ret%=mod;
            }
                
        }
        return dp[s][n] = ret;
    }
    
    public int knightDialer(int n) {
        int ans = 0;
        for(int[] ar : dp )
            Arrays.fill(ar,-1);
        for(int s = 0 ; s < 10 ; s++ ){
            int temp = solve(s, n-1);
            temp%=mod;
            ans%=mod;
            ans+=temp;
            ans%=mod;
        }
        
        return ans;
    }
}

/*

1
2
3
4
5
6
7
81
3131
1000
1005
754
2653
3562
5000
3214
652
4899
4787
4698
4365
4125
4525
4785

*/