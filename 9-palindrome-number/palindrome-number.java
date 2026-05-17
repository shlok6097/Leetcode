class Solution {
    public boolean isPalindrome(int x) {

        int rev=0;
        int n =x;

        while(n>0){
            int num = n%10;
            rev = (rev * 10) + num;
            n = n/10;
        }
        
        return x==rev;

        
        
    }
}