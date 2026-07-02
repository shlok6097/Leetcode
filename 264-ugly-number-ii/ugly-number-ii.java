class Solution {
    public int nthUglyNumber(int n) {

        // int count =0;
        // int k =1;

        // while(count < n){

        //     if(isUgly(k)) count++;

        //     k++;

        // }

        int[] arr = new int[n];
        arr[0] = 1;
        int i=0,j=0,k =0;

        for(int x =1; x<n; x++){

            int next2 = arr[i] * 2;
            int next3 = arr[j] * 3;
            int next5 = arr[k] * 5;
           
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            arr[x] = nextUgly;
            
            
            if (nextUgly == next2) i++;
            if (nextUgly == next3) j++;
            if (nextUgly == next5) k++;

        }
        return arr[n-1];
        
    }
    //  public boolean isUgly(int n) {
      
    //     if(n<=0)return false;

    //     while(n % 2 ==0) n = n/2;
    //     while(n % 3 == 0) n= n/3;
    //     while(n % 5 == 0)  n = n/5;

    //     return n==1;
    // }
}