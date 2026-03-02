class Solution {
    public String reverseWords(String s) {
        String[] w = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i =0; i<w.length;i++){
            ans.append(new StringBuilder(w[i]).reverse().toString());
            if (i < w.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
        
    }
   
}