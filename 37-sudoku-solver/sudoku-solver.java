class Solution {
    public void solveSudoku(char[][] board) {
        slove(board);

        
    }
    public boolean slove(char[][] board){
        for(int i =0; i<9; i++){
            for(int j =0; j<9; j++){
                if(board[i][j]=='.'){
                    //try 1 to 9
                    for(char num = '1';num<='9';num++){
                      if(isvalid(board,i,j,num)){
                        board[i][j]=num;
                        if(slove(board)){
                            return true;
                        }
                        board[i][j]='.';


                      }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isvalid(char[][]board,int row,int col,char num){
        for(int j =0; j<9;j++){
            if(board[row][j]==num) return false;
        }
        for(int i=0;i<9;i++)
        if(board[i][col]==num)return false;

        //3x3
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;

        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                if(board[startRow+i][startCol+j]==num) return false;
            }
        }
        return true;
    }
}