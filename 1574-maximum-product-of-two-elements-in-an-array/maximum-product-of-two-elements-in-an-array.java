class Solution {
    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        int k =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
                k =i;

            }
                
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min && k != i)
                min = nums[i];
        }

        return (min-1)*(max-1);

    }
}