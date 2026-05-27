class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder lower = new StringBuilder(title.toLowerCase());
        int n = lower.length();
        int start = 0;

        for (int i = 0; i <= n; i++) {
           // char ch = lower.charAt(i);

            if (i == n || lower.charAt(i) == ' ') {
                int wordLength = i - start;

                
                if (wordLength > 2) {
                    char upper = Character.toUpperCase(lower.charAt(start));
                    lower.setCharAt(start, upper); 
                }

                
                start = i + 1;
            }
        }
        return lower.toString();

    }
}