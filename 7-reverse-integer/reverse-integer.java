class Solution {
    public int reverse(int x) {
        int revarse= 0;
        int n=x;
        if(n<0){
            n = -n;
            while(n>0){
             int ld= n%10;
             n = n/10;
              if (revarse > (Integer.MAX_VALUE - ld) / 10) {
                return 0; 
            }
             revarse=( revarse * 10) +ld;
        }
            return -revarse;
        }else{
             while(n>0){
             int ld= n%10;
             n = n/10;
              if (revarse > (Integer.MAX_VALUE - ld) / 10) {
                return 0; 
            }
             revarse=( revarse * 10) +ld;
        }
        }
        return revarse;

        
    }
}