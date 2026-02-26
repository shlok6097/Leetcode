class Solution {
    public int findDuplicate(int[] nums) {
        cyclicsort(nums);
        for(int i=0;i<nums.length;i++){
            if(i+1 != nums[i]) return nums[i];
        }
        return -1;
        
    }
    public void cyclicsort(int[] nums){
        int i =0;
        while(i<nums.length){
            int c= nums[i]-1;
            if(nums[i] != nums[c]){
                int temp = nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
            }else i++;
        }
    }
}