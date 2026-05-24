class Solution {
    public boolean isValidSudoku(char[][] board) {
        //row
        for(int i =0; i<9;i++){
            boolean[] seen = new boolean[9];
            for(int j=0; j<9;j++){
                if(board[i][j] != '.'){
                    int num = board[i][j]-'1';
                    if(seen[num]) return false;
                    seen[num]= true;
                }
            }
        }
        //col
         for(int j =0; j<9;j++){
            boolean[] seen = new boolean[9];
            for(int i=0; i<9;i++){
                if(board[i][j] != '.'){
                    int num = board[i][j]-'1';
                    if(seen[num]) return false;
                    seen[num]= true;
                }
            }
        }
        //3x3 box 
        for(int i =0;i<9; i+=3){
            for(int j =0; j<9; j+=3){
                boolean[] seen = new boolean[9];
                //inside 3x3 matrix
                for(int k=0; k<3;k++){
                    for(int l=0;l<3;l++){
                        char c=board[i+k][j+l];
                        if(c != '.'){
                            int num = c-'1';
                            if(seen[num])return false;
                            seen[num]= true;
                        }
                    }
                }
            }
        }

        
       return true;
        
    }
}