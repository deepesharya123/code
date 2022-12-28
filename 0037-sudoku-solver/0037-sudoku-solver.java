class Solution {
    
    public static boolean isValid(char[][] board,int r,int col,char c){
        int i =0;
        for(i=0;i<9;i++){
            if(board[r][i]==c || board[i][col]==c)
                return false;
        }
        
        int rr = r/3;
        int cc = col/3;
        rr*=3;
        cc*=3;
        int j =0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(board[rr+i][cc+j]==c)
                    return false;
            }
        }
        return true;
    }
    
    public static boolean solve(char[][] board,int row,int col){
        int i = 0,j =0;
        
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(board[i][j]=='.'){

                    for(char c='1';c<='9';c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board,i,j) ){
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                        }
                    }
                }
                if(board[i][j]=='.')
                    return false;
                
            }
        }
        
        return true;
    }
    
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
        // for(int i =0;i<9;i++){
        //     for(int j=0;j<9;j++){
        //         System.out.print(board[i][j]+" ");
        //     }System.out.println();
        // }
    }
}