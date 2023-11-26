class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int ans = 0;
        int[][] mat = new int[n][m];
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++)
                mat[i][j] = matrix[i][j];
        }
        
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++ ){
                if( mat[i][j] == 1 && i > 0 ){
                    mat[i][j]+=mat[i-1][j];
                }
            }
            
            int[] ar = mat[i].clone();
            Arrays.sort(ar);
            for(int j = 0 ; j < m ; j++ ){
                int temp = ar[j] * (m-j);
                ans = Math.max(ans, temp);
            }
            
        }
        
        return ans;
    }
}