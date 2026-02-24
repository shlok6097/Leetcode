class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       
        int[] ans = new int[nums.length];
        int i =0;
        int k=0;
        int j =1;
       
        while(i<nums.length){
            if(nums[i] % 2==0){
                 ans[k]=nums[i];
                 k=k+2;
            }else{
                ans[j]=nums[i];
                j = j+2;
            }
            i++;

        }
        return ans;
    }
}