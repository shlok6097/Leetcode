class Solution {
    public boolean isBalanced(String num) {
        int odd =0;
        int evan =0;
        boolean isEvan = true;
        for(char ch : num.toCharArray()){
            
            int x = ch-'0';
            if(isEvan){
                evan +=x;
                isEvan = false ;
            }else{
                 odd +=x;
                isEvan = true;

            }
             
          



        }
        return odd == evan ;
        
    }
}