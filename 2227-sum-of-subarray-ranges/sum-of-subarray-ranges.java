class Solution {
    public long subArrayRanges(int[] nums) {

        return sumSubarrayMax(nums) - sumSubarrayMins(nums);
        
    }

     public long sumSubarrayMins(int[] arr) {
        int[] nse = findNse(arr);
        int[] pse = findPse(arr);

        long total = 0;
        int mod =  1_000_000_007;
        for (int i = 0; i < arr.length; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;
            long lr = (left*right);
            long contr = (lr*arr[i]);

            total = (total + contr);

            
        }

        return total;

    }

    private int[] findPse(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    private int[] findNse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i])
                st.pop();

            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return ans;
    }
     public long sumSubarrayMax(int[] arr) {
        int[] nge = findNge(arr);
        int[] pge = findPge(arr);

        long total = 0;
        int mod =  1_000_000_007;
        for (int i = 0; i < arr.length; i++) {
            long left = i - pge[i];
            long right = nge[i] - i;
            long lr = (left*right);
            long contr = (lr*arr[i]);

            total = (total + contr);

            
        }

        return total;

    }

    private int[] findPge(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    private int[] findNge(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i])
                st.pop();

            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return ans;
    }
}