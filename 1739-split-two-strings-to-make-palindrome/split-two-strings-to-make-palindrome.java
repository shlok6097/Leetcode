class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
     
        return validate(a, b) || validate(b, a);
    }

    private boolean validate(String s1, String s2) {
        int left = 0;
        int right = s1.length() - 1;

      
        while (left < right && s1.charAt(left) == s2.charAt(right)) {
            left++;
            right--;
        }

       
        return isPalindrome(s1, left, right) || isPalindrome(s2, left, right);
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
