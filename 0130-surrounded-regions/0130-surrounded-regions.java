class Solution {
    
    public static void dfs(char[][] board,int [][] vis, int row, int col){
        vis[row][col] = 1;
        
        int n = vis.length, m = vis[0].length;
        
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        for(int i =0;i<4;i++){
            int nr = row + dr[i];
            int nc = col + dc[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && board[nr][nc]=='O' && vis[nr][nc]==0)
                dfs(board,vis,nr,nc);
        }
    }
    
    public void solve(char[][] board) {
        int n = board.length, m = board[0].length;
        int[][] vis = new int[n][m];
        int i = 0,j=0;
        
        for(i=0;i<n;i++)
            if(board[i][0]=='O' && vis[i][0]==0 )
                dfs(board,vis,i,0);
        
        for(i=0;i<n;i++)
            if(board[i][m-1]=='O' && vis[i][m-1]==0)
                dfs(board,vis,i,m-1);
        
        for(i=0;i<m;i++)
            if(board[0][i]=='O' && vis[0][i]==0)
                dfs(board,vis,0,i);
        
        for(i=0;i<m;i++)
            if(board[n-1][i]=='O' && vis[n-1][i]==0)
                dfs(board,vis,n-1,i);
        
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(board[i][j]=='O'){
                    if(vis[i][j]==1)
                        board[i][j]='O';
                    else
                        board[i][j]='X';
                }else{
                    board[i][j]='X';
                }
            }
        }
        
        
    }
}