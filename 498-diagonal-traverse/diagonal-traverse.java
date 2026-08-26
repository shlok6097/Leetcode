class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;
        
        for (int d = 0; d < m + n - 1; d++) {
            if (d % 2 == 0) {
                // Moving Up-Right
                int r = Math.min(d, m - 1);
                int c = d - r;
                while (r >= 0 && c < n) {
                    result[idx++] = mat[r][c];
                    r--;
                    c++;
                }
            } else {
                // Moving Down-Left
                int c = Math.min(d, n - 1);
                int r = d - c;
                while (c >= 0 && r < m) {
                    result[idx++] = mat[r][c];
                    r++;
                    c--;
                }
            }
        }
        
        return result;
    }
}