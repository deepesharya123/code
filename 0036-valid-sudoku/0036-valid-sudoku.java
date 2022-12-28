class Solution {

    public static boolean isValid(char[][] board){
        int i= 0,j=0;
        
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char c = board[i][j];
                    for(int k =0;k<9;k++){
                        if((k!=i)&&board[k][j]==c )
                            return false;
                        if( k!=j &&board[i][k]==c)
                            return false;
                        if((i/3)*3+k/3!=i && (j/3)*3+k%3!=j  &&  board[(i/3)*3+k/3][(j/3)*3+k%3]==c)
                            return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        return isValid(board);
    }
}