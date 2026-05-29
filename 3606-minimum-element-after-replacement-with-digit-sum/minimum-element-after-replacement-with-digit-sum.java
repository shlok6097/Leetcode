class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        
        for (int num : nums) {
            int cur = 0;
            int temp = num;
            
            
            while (temp > 0) {
                cur += temp % 10;
                temp /= 10;
            }
            
            
            if (cur < min) {
                min= cur;
            }
        }
        
        return min;
    }
}