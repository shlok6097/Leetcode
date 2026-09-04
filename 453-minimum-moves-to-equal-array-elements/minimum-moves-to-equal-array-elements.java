class Solution {
    public int minMoves(int[] nums) {
        int sum =0;
        int min = nums[0];
        for(int i : nums){
            sum += i;
            if(min>i) min = i;
        }
        
        return sum-(min*nums.length);
        
    }
}