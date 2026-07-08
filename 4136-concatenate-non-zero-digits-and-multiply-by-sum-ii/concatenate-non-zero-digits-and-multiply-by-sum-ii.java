

class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int m = s.length();
        long MOD = 1_000_000_007L;
        
        
        List<Integer> nz = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0) {
                nz.add(digit);
            }
        }
        
        int k = nz.size();
        
        
        long[] pow10 = new long[k + 1];
        pow10[0] = 1;
        for (int i = 1; i <= k; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }
        
        
        long[] prefX = new long[k + 1];   
        long[] prefSum = new long[k + 1]; 
        
        for (int i = 0; i < k; i++) {
            prefX[i + 1] = (prefX[i] * 10 + nz.get(i)) % MOD;
            prefSum[i + 1] = prefSum[i] + nz.get(i);
        }

        int[] next_nz = new int[m];
        int lastIdx = k; 
        for (int i = m - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                lastIdx--;
            }
            next_nz[i] = lastIdx;
        }
        
        int[] prev_nz = new int[m];
        int firstIdx = -1;
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != '0') {
                firstIdx++;
            }
            prev_nz[i] = firstIdx;
        }
        
        
        int numQueries = queries.length;
        int[] answer = new int[numQueries];
        
        for (int i = 0; i < numQueries; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            
            int L = next_nz[l];
            int R = prev_nz[r];
            
            if (L > R) {
                answer[i] = 0;
                continue;
            }
            
            
            long sum = prefSum[R + 1] - prefSum[L];
            
            
            long x = (prefX[R + 1] - (prefX[L] * pow10[R - L + 1]) % MOD + MOD) % MOD;
           
            answer[i] = (int) ((x * (sum % MOD)) % MOD);
        }
        
        return answer;
    }
}