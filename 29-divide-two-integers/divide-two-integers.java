class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        
        int negDividend = dividend < 0 ? dividend : -dividend;
        int negDivisor = divisor < 0 ? divisor : -divisor;

        int quotient = 0;

        
        for (int shift = 31; shift >= 0; shift--) {
           
            if ((negDivisor >= (Integer.MIN_VALUE >> shift)) && (negDivisor << shift) >= negDividend) {
                negDividend -= (negDivisor << shift);
                quotient += (1 << shift);
            }
        }

       
        return isNegative ? -quotient : quotient;
    }
}