class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length - 1;
        List<Integer> ans = new ArrayList<>();

        int k = 0;

        for (int i = nums[0]; i <= nums[n]; i++) {
            if (i == nums[k])
                k++;
            else
                ans.add(i);
        }

        return ans;
    }
}