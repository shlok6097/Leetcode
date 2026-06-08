class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int low = 0;
        int high = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                ans[low++] = nums[i];
            }
            if (nums[n - 1 - i] > pivot) {
                ans[high--] = nums[n - 1 - i];
            }
        }
        
        
        while (low <= high) {
            ans[low++] = pivot;
        }
        
        return ans;
    }
}