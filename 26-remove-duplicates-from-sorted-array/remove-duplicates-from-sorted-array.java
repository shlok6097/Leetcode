class Solution {
    public int removeDuplicates(int[] nums) {
        int j =0;
        for(int i =1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
         int count=0;
       for(int k =0; k<= j; k++){
        count ++;
       }
       return count;

    }
}