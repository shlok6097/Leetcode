class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++)
            sum += nums[i];

        int n = nums.length ;

        int maxSum=sum;

        if (k == n) {
            return (double)maxSum / k;
        }

        int i = 1;
        int j = k ;

        while (j < n) {
            sum = sum + nums[j] - nums[i - 1];

           maxSum= Math.max(sum,maxSum);

            i++;
            j++;
        }

        return (double)maxSum / k;

    }
}