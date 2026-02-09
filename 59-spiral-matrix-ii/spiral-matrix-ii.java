class Solution {
    public int[][] generateMatrix(int n) {
        int m = n-1;
        int l = n-1 ;
        int top = 0;
        int bottom = m;
        int left =0;
        int right =l;
        int num=1;

        int [][]ans = new int[n][n];
      while(top <= bottom && left <= right){
        for(int i=left;i<=right;i++){
            ans[top][i]=num;
            num++;
        }
        top++;
        for(int i = top; i<= bottom; i++){
            ans[i][right]=num;
            num++;
        }
        right--;
        if(top <= bottom){
        for(int i = right; i>=left; i--){
            ans[bottom][i] =num;
            num++;
        }
        bottom--;
        }
        if(left <= right){
         for(int i = bottom; i>=top; i--){
            ans[i][left]=num;
            num++;
        }
        left++;
        }
      }
      return ans;
    }
        
    
}