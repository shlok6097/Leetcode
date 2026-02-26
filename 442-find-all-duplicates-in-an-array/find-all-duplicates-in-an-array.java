class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++ ){
            if(i+1 != nums[i]) ans.add(nums[i]);
        }
        return ans;
        
    }
    private void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }


}