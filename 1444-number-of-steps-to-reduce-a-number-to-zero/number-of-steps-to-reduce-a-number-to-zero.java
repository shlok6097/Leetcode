class Solution {
    public int numberOfSteps(int num) {

        int count =0;

        int red = num;

        while(red > 0){
            if(red % 2 == 0){
                red = red/2;

            }else{
                red = red -1;
            }
            count++;

        }
        return count;
        
    }
}