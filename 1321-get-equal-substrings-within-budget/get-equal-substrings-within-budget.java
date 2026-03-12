class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int left = 0;
        int currentCost = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {
            // Add cost of current character transformation
            currentCost += Math.abs(s.charAt(right) - t.charAt(right));

            // If we exceed budget, shrink the window from the left
            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
