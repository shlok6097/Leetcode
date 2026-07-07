class Solution {
    public long sumAndMultiply(int n) {

        long sum = 0;
        long rev = 0;
        long x = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        while (rev > 0) {
            long digit = rev % 10;

            if (digit != 0) {
                sum += digit;
                x = x * 10 + digit;

            }
            rev = rev / 10;

        }
        return x * sum;

    }
}