class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sferq = new int[26];
        int[] tferq = new int[26];

        for(char ch : s.toCharArray()) sferq[ch-'a']++;
        for(char ch : t.toCharArray()) tferq[ch-'a']++;

        for(int i =0; i<26; i++){
            if(sferq[i] != tferq[i]) return false;
        }

        return true;
        
    }
}