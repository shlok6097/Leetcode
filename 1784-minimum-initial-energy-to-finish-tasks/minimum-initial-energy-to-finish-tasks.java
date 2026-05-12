import java.util.Arrays;

class Solution {
    public int minimumEffort(int[][] tasks) {
        
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        
        int cE = 0;
        int iE = 0;
        
        for (int[] task : tasks) {
            int actual = task[0];
            int min= task[1];

            if (cE < min) {
        
                iE += (min - cE);
                
                cE = min;
            }
            
          
            cE -= actual;
        }
        
        return iE;
    }
}