class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int lay = Math.min(m, n) / 2;
        for (int l = 0; l <lay; l++) {
           
            List<Integer> ll = new ArrayList<>();

          
            for (int j = l; j < n - 1 - l; j++)
                ll.add(grid[l][j]);
           
            for (int i = l; i < m - 1 - l; i++)
                ll.add(grid[i][n - 1 - l]);
           
            for (int j = n - 1 - l; j > l; j--)
                ll.add(grid[m - 1 - l][j]);
            
            for (int i = m - 1 - l; i > l; i--)
                ll.add(grid[i][l]);

           
            int size = ll.size();
            int rot = k % size;

            
            int index = rot; 

            for (int j = l; j < n - 1 - l; j++)
                grid[l][j] = ll.get(index++ % size);
            for (int i = l; i < m - 1 - l; i++)
                grid[i][n - 1 - l] = ll.get(index++ % size);
            for (int j = n - 1 - l; j > l; j--)
                grid[m - 1 - l][j] = ll.get(index++ % size);
            for (int i = m - 1 - l; i > l; i--)
                grid[i][l] = ll.get(index++ % size);
        }

        return grid;

    }
}