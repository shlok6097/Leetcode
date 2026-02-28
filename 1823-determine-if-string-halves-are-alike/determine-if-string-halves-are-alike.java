class Solution {
    public boolean halvesAreAlike(String s) {
       // s.toLowerCase();
        char[] st = s.toCharArray();
        int n = st.length;
        int count1 =0;
        int count2 =0;
        for(int i =0; i<n/2;i++){
            if(st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u'||st[i]=='A'||st[i]=='E'||st[i]=='I'||st[i]=='O'||st[i]=='U') count1++;

        }
        for(int i =n/2; i<n;i++){
            if(st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u'||st[i]=='A'||st[i]=='E'||st[i]=='I'||st[i]=='O'||st[i]=='U') count2++;

        }
        if(count1==count2)return true;
        return false;

        
    }
}