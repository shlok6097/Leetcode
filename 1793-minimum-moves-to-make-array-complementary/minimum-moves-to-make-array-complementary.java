

class Solution {
    public int minMoves(int[] nums, int limit) {
        
        int[] diff = new int[2 * limit + 2];
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            int a = nums[i];
            int b = nums[n - 1 - i];


            diff[2] += 2;
            diff[2 * limit + 1] -= 2;
            int min = Math.min(a, b) + 1;
            int max = Math.max(a, b) + limit;
            diff[min] -= 1;
            diff[max + 1] += 1;

            int cursum = a + b;
            diff[cursum] -= 1;
            diff[cursum + 1] += 1;
        }

        int minMoves = n; 
        int curmoves = 0;
        for (int i = 2; i <= 2 * limit; i++) {
            curmoves += diff[i];
            minMoves = Math.min(minMoves, curmoves);
        }

        return minMoves;
    }
}