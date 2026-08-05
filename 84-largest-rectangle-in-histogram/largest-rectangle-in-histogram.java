class Solution {
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