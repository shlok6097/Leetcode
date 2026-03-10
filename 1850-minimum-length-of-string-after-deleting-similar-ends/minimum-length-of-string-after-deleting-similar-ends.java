class Solution {
    public int minimumLength(String s) {
        char [] st =  s.toCharArray();
       
        int l=0,r=st.length-1;
        while(l<r && st[l]==st[r]){
            char temp =st[l];
            while(l<=r && st[l]==temp)l++;
            while(l<=r && st[r]==temp)r--;

        }
        return (r-l+1);
    }
}