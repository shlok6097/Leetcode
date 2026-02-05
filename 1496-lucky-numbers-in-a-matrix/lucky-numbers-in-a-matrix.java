class Solution {
   
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
             int rowmin =rowmin(i,matrix);
             int colindex =-1;
            for (int j = 0; j < matrix[i].length; j++) {
              if (matrix[i][j] == rowmin) {
                colindex = j;
                break;
            }
                
               
            }

        
        boolean islucky = true;
        for(int k =0; k<matrix.length;k++){
            if (matrix[k][colindex] > rowmin) {
                islucky = false;
                break;
            }
        }
        if(islucky){
           ans.add(rowmin);
        }
    }

        return ans;

    }

    private static int rowmin(int i, int[][] matrix) {
        int rowmin =matrix[i][0];
        for(int j=0;j< matrix[i].length;j++){
            if(matrix[i][j] < rowmin){
                rowmin = matrix[i][j];
            }

        }
        return rowmin;
    }
}