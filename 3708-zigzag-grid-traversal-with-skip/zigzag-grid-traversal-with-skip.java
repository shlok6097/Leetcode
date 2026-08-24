class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {

        List<Integer> ls = new ArrayList<>();
        boolean isAdded = true;

        for(int i =0; i<grid.length;i++){
            if(i%2==0){
                
                for(int j=0; j<grid[i].length;j++){
                    if(isAdded) ls.add(grid[i][j]);
                    isAdded = !isAdded;
                }
            }else{
                for(int j=grid[i].length-1; j>=0;j--){
                    if(isAdded) ls.add(grid[i][j]);
                    isAdded = !isAdded;
                }

            }
        }
        return ls;
    }
}