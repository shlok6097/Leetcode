import java.util.HashSet;

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> distances = new HashSet<>();
        
        
        distances.add(getSquaredDistance(p1, p2));
        distances.add(getSquaredDistance(p1, p3));
        distances.add(getSquaredDistance(p1, p4));
        distances.add(getSquaredDistance(p2, p3));
        distances.add(getSquaredDistance(p2, p4));
        distances.add(getSquaredDistance(p3, p4));
        
        
        return distances.size() == 2 && !distances.contains(0);
    }
    
    private int getSquaredDistance(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }
}