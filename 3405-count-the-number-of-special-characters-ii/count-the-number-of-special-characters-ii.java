class Solution {
    public int numberOfSpecialChars(String word) {
       int[] llower = new int[26];
       int[] fupper = new int[26];

       java.util.Arrays.fill(llower,-1);
       java.util.Arrays.fill(fupper,-1);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                llower[ch - 'a'] = i;
            else{
                int index = ch-'A';
                if(fupper[index]==-1)
                 fupper[index] = i;

            }
               
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (llower[i] != -1&& fupper[i] != -1 && llower[i]<fupper[i])
                count++;
        }

        return count;

    }
}