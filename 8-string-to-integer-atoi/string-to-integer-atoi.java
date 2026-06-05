class Solution {
    public int myAtoi(String s) {
         s = s.trim();

        if(s.length()==0) return 0;

       
        int k = 0;

        long num = 0;
        int sign = 1;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            if (s.charAt(k) == '-') {
                sign = -1;
            }
            k++;
        }

        for (int i = k; i < s.length(); i++) {
            char ch = s.charAt(i);
            int digit = ch - '0';
            if (ch >= '0' && ch <= '9'){
                num = num * 10 + digit;
            if (sign == 1 && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && (-num) < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            }
            else if (ch == '0' & ch == s.charAt(0))
                continue;
            else
                break;

        }

        return (int) (sign * num);

    }
}