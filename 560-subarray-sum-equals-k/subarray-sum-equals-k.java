class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        for(int st=0;st<nums.length;st++){
            int sum =0;
            for(int end =st; end<nums.length;end++){
                sum += nums[end];
                if(sum==k) count++;

            }
        }
        return count;
    }
}