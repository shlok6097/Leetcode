class Solution {
    public boolean isPowerOfThree(int n) {

       double y = Math.log(n) / Math.log(3);

       if(Math.abs(y - Math.round(y)) < 1e-10)return true;

       return false;
        
    }
}