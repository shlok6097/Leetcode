
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        
        
        if (s == null || p == null || s.length() < p.length()) {
            return res;
        }
        
        
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        int pLen = p.length();
        int sLen = s.length();
        
        
        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        
       
        for (int i = 0; i <= sLen - pLen; i++) {
           
            if (matches(pCount, sCount)) {
                res.add(i);
            }
            
           
            if (i < sLen - pLen) {
              
                sCount[s.charAt(i) - 'a']--;
                
                sCount[s.charAt(i + pLen) - 'a']++;
            }
        }
        
        return res;
    }
    
   
    private boolean matches(int[] pCount, int[] sCount) {
        for (int i = 0; i < 26; i++) {
            if (pCount[i] != sCount[i]) {
                return false;
            }
        }
        return true;
    }
}