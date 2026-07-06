class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

       Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); 
            }
            return Integer.compare(a[0], b[0]); 
        });


        int n = intervals.length;
        int k=0;

         for(int[] i : intervals){
            if(i[1]<= k){
                n--;
            }else{
                k=i[1];
            }
         }
        return n;
        
    }
}