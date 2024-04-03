class Solution {
    
    public boolean solve(int cr , int cc , String word, char[][] board , int wi ,int[][] vis){
        if( wi +1 >=  word.length() )
            return true;
        
        int[] d = {-1 , 0,1,0,-1};
        
        int n = board.length, m = board[0].length;
        boolean ret = false;
        for(int i = 0 ; i < 4 ;i++ ){
            int nr = cr + d[i] , nc = cc + d[i+1];
            if( nr >= 0 && nr < n && nc >= 0 && nc < m && board[nr][nc] == word.charAt(wi+1) && vis[nr][nc] == 0){
                vis[nr][nc] = 1;
                ret |= solve(nr, nc , word , board, wi+1,vis);
                vis[nr][nc] = 0;
                if( ret ){
                    return ret;
                }
            }
        }
        
        return false;
    }
    
    public boolean exist(char[][] board, String word) {
        int[][] vis = new int[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++ ){
            for(int j = 0 ; j < board[0].length; j++ ){
                if( board[i][j] == word.charAt(0) ){
                    vis[i][j] = 1;
                    boolean ans = solve( i , j , word, board ,0,vis);
                    vis[i][j] = 0;
                    if( ans )
                        return ans;
                }
            }
        }
        
        return false;
    }
}

/*
[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"ABCCED"
[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"SEE"
[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"ABCB"
[["C","A","A"],["A","A","A"],["B","C","D"]]
"AAB"
*/