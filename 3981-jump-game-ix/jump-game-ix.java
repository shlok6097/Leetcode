class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
  
        int[] preMax = new int[n];
        preMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            preMax[i] = Math.max(preMax[i - 1], nums[i]);
        }
        
    
        int[] sufMin = new int[n];
        sufMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufMin[i] = Math.min(sufMin[i + 1], nums[i]);
        }
        
     
        int currentMax = 0;
        int lastBoundary = 0;
        
        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, nums[i]);
            if (i == n - 1 || preMax[i] <= sufMin[i + 1]) {
                
                for (int j = lastBoundary; j <= i; j++) {
                    ans[j] = currentMax;
                }
                lastBoundary = i + 1;
                currentMax = 0;
            }
        }
        
        return ans;
    }
}