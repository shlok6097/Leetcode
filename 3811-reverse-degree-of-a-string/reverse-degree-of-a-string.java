class Solution {
    public int reverseDegree(String s) {
        
        

        int ans =0;

        for(int i =0; i<s.length();i++){
           int charVal = 'z'- s.charAt(i) +1;
           int pos = i+1;

            ans += charVal *pos;
        }
        return ans;
        
    }
}