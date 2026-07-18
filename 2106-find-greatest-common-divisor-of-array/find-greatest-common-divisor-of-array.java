class Solution {
    public int findGCD(int[] nums) {

        int max = Arrays.stream(nums).max().getAsInt();
         int min = Arrays.stream(nums).min().getAsInt();

         return gcd(max,min);
        
    }

    public int gcd(int a,int b){
        while(b !=0){
            int temp =b;
            b = a%b;
            a= temp;
        }

        return a;
    }
}