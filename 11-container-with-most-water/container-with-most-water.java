class Solution {
    public int maxArea(int[] height) {

        int i=0;
        int j = height.length-1;
        int area =0;
        
        while(i<j){
            int area1 = Math.min(height[i],height[j])*(j-i);

            if(area1 > area){
                area= area1;
            }
           if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }


            
        }
        return area;
    }
}