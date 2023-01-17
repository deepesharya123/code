class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        int i = 0,j=0;
        for(i=0;i<n;i++)
            dp[i][0] = matrix[i][0];
        
        for(i=0;i<m;i++)
            dp[0][i] = matrix[0][i];
        
        for(i=1;i<n;i++){
            for(j=1;j<m;j++){
                if(matrix[i][j]==1)
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                else
                    dp[i][j]=0;
            }
        }
        int ans = 0;
      for(i=0;i<n;i++){
          for(j=0;j<m;j++){
            System.out.print(dp[i][j]+" ");
              ans+=dp[i][j];       
          }
          System.out.println();
      }
        return ans;
    }
}