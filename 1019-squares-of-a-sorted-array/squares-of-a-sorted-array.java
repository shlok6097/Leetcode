class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i =0;
        int j= n-1;
        int k =n-1;
        while(i<=j){
            int l= nums[i]*nums[i];
            int r = nums[j]*nums[j];

            if(l<r){
                ans[k]=r;
                j--;
            }else {
                ans[k]=l;
                i++;
                
            }
            k--;
        }
        return ans;
         
    }
}