/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int st = 1;
        int end = n;
        
    
        while(st < end){
            int mid = st +(end-st)/2;
            boolean bad = isBadVersion(mid);
           
            if(bad) end = mid;
            else st = mid+1 ;
           
        }
        return st;
        
    }
}