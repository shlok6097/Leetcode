class Solution {
    public long countCommas(long n) {
         long total =0;
       for (long threshold = 1000; threshold <= n; threshold *= 1000) {
            total += (n - threshold + 1);
            
            if (threshold > Long.MAX_VALUE / 1000) break;
        }

        return total;
    }
}