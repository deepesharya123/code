class Solution {
    int[][] dp ;
    
    public int solve(int row, int col, int[][] grid) {
        int n = grid.length , m = grid[0].length;
        if( row == n )
            return 0;
    
        if( dp[row][col] != -1 )
            return dp[row][col];
        
        int ret = grid[row][col];
        int add = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ;i++ ){
            if( i == col )
                continue;
            int temp = solve(row + 1 ,i , grid );
            add = Math.min(add , temp);
        }
        if( add == Integer.MAX_VALUE )
            add = 0 ;
        
        dp[row][col] = add+ ret;
        return add+ret;
    }
    
    public int minFallingPathSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
        dp = new int[203][203];
        for(int[] ar : dp )
            Arrays.fill(ar, -1 );
        
        for(int i = 0 ; i < grid.length ; i++ ){
            int temp = solve(0, i , grid);
            ans = Math.min(ans, temp);
        }
        
        return ans;
    }
}