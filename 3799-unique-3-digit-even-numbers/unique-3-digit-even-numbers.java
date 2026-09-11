class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        int ans = 0;


        for (int num = 100; num < 1000; num += 2) {
            int h = num / 100;
            int t = (num / 10) % 10;
            int u = num % 10;

            int[] currentNeed = new int[10];
            currentNeed[h]++;
            currentNeed[t]++;
            currentNeed[u]++;

            if (currentNeed[h] <= count[h] && 
                currentNeed[t] <= count[t] && 
                currentNeed[u] <= count[u]) {
                ans++;
            }
        }

        return ans;
    }
}