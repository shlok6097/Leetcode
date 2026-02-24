class Solution {
    public int[] sortArrayByParity(int[] nums) {
      //  Arrays.sort(nums);
        int[] ans = new int[nums.length];
        int i =0;
        int k=0;
        int j = nums.length-1;
        while(i<nums.length){
            if(nums[i] % 2==0){
                 ans[k]=nums[i];
                 k++;
            }else{
                ans[j]=nums[i];
                j--;
            }
            i++;

        }
        return ans;
        
    }
}