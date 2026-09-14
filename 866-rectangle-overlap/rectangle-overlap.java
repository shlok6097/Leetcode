class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int a_x1 = rec1[0];
        int a_x2 = rec1[2];
        int a_y1 = rec1[1];
        int a_y2 = rec1[3];

        int b_x1 = rec2[0];
        int b_x2 = rec2[2];
        int b_y1 = rec2[1];
        int b_y2 = rec2[3];

        boolean xOverLap = b_x1 < a_x2 && b_x2 > a_x1;
        boolean yOverLap = b_y1 < a_y2 && b_y2 > a_y1;

        return xOverLap && yOverLap;
        
    }
}