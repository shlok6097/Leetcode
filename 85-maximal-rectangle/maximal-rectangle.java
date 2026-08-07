class Solution {
    public int maximalRectangle(char[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] prefixSum = new int[m][n];

        for(int j =0; j<n; j++){
            int sum =0;
            for(int i =0; i<m;i++){
                int k= (matrix[i][j] -'0');
                sum += k;
                if(matrix[i][j] == '0') sum =0;
                prefixSum[i][j] = sum;
            }
        }

        int maxArea = 0;

        for(int i =0; i<m; i++){
            maxArea = Math.max(maxArea,largestRectangleArea(prefixSum[i]));
        }


        return maxArea;


        
    }
     public int largestRectangleArea(int[] heights) {

        int[] nse = findNse(heights);
        int [] pse = findPse(heights);

        int max =0; 
        for(int i =0; i< heights.length; i++){
            max = Math.max(max, heights[i]*(nse[i] - pse[i] -1));
        }
        return max;
        
    }

    private int[] findNse(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>() ;

        for(int i= arr.length-1; i>= 0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? arr.length:st.peek();
            st.push(i);
        }
        return ans;
    }
    private int[] findPse(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>() ;

        for(int i=0 ; i <=arr.length-1 ;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1:st.peek();
            st.push(i);
        }
        return ans;
    }
}