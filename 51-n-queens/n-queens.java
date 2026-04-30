

class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0;i<n;i++)
            Arrays.fill(board[i], '.');

        solve(0, board, res, n);
        return res;
    }

    void solve(int col, char[][] b, List<List<String>> res, int n) {
        if(col == n) {
            List<String> temp = new ArrayList<>();
            for(char[] row : b)
                temp.add(new String(row));
            res.add(temp);
            return;
        }

        for(int row=0; row<n; row++) {
            if(isSafe(b, row, col, n)) {
                b[row][col] = 'Q';
                solve(col+1, b, res, n);
                b[row][col] = '.'; // backtrack
            }
        }
    }

    boolean isSafe(char[][] b, int r, int c, int n) {

        for(int i=0;i<c;i++)
            if(b[r][i]=='Q') return false;

        for(int i=r,j=c;i>=0&&j>=0;i--,j--)
            if(b[i][j]=='Q') return false;

        for(int i=r,j=c;i<n&&j>=0;i++,j--)
            if(b[i][j]=='Q') return false;

        return true;
    }
}