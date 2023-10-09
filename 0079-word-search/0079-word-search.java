class Solution {
    
    public boolean solve(char[][] board, int[][] vis, String word, int ind, int r, int c){
        int sl = word.length();
        if( ind == sl )
            return true;
        int n = board.length, m = board[0].length;
        
        if( r < 0 || r >= n || c < 0 || c >= m || ( board[r][c] != word.charAt(ind) ) || (board[r][c] == word.charAt(ind) && vis[r][c] == 1) ) 
            return false;
        
        
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        vis[r][c] = 1;
        
        for(int i = 0 ; i < 4; i++){
            int nr = r+dr[i];
            int nc = c+dc[i];
            
            if( solve(board, vis, word, ind+1, nr,nc)){
                return true;
            }
        }
        
        vis[r][c] = 0;
        return false;
    }
    
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        int[][] vis = new int[n][m];
        boolean ret = false;
        
        for( int i = 0 ; i < n ;i++){
            for( int j = 0; j < m ;j++){
                if( word.charAt(0) == board[i][j] &&  solve(board, vis, word, 0,i,j)){
                    return true;
                }
            }
        }
        System.out.println("final false");
        return false;
    }
}


/*

[["A"]]
"A"
[["A","B"]]
"AB"
[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"ABCCED"
[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"SEE"
[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"ABCB"


*/