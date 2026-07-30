class Solution {
    public int minimumPushes(String word) {

        int size = word.length();
        

        int n = size % 8;

        int k = (size - n) / 8;

        int ans = 4 * (k * (k + 1)) + (k+1) * n;

        return ans;
    }
}