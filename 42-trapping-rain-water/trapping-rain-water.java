class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int [] prefix = new int[n];
        int [] sufix = new int[n];

        prefix[0] = height[0];
        for(int i =1; i<n ; i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }
        sufix[n-1]= height[n-1];
        for(int i = n-2; i >=0;i--){
            sufix[i] = Math.max(sufix[i+1],height[i]);
        }
        int total = 0;
        for(int i =0; i<n ; i++){
            int rmax = sufix[i];
            int lmax = prefix[i];

            if(height[i] <lmax && height[i]<rmax){
                total += Math.min(lmax, rmax) - height[i];

            }
        }
        return total;
    }
}