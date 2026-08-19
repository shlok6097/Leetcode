class Solution {
    public boolean isHappy(int n) {

        int slow =n;
        int fast = square(n);
        while(fast !=1 && slow != fast){
            slow = square(slow);
            fast = square(square(fast));
        }

        
       return fast ==1;

        
    }
    private int square(int n ){
        int num =0;
        while(n >0){

            int digit = n%10;
            num +=digit*digit;
            n = n/10;
        }
        return num;
    }
}