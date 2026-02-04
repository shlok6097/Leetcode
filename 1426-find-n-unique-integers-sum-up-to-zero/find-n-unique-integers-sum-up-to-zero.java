class Solution {
    public int[] sumZero(int n) {

        int[] arr = new int[n];
        int index = 0;

        for(int x = 1; x <= n/2; x++){
            arr[index++] = x;
            arr[index++] = -x;
        }

        if(n % 2 == 1){
            arr[index] = 0;
        }

        return arr;
    }
}
