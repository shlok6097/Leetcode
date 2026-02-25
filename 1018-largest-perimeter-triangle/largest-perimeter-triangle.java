class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int i=0;
        int n = nums.length-1;
        int a = n-2;
        int b=n-1;
        int c =n;
        while(i<n && a >= 0){
            if(nums[a]+nums[b]>nums[c]){
                int sum = nums[a] + nums[b] +nums[c];
                if(ans<sum) ans= sum;
                a--;
                b--;
                c--;
            }else{
                a--;
                b--;
                c--;
            }
            i++;
        }
        return ans;
        
    }
}