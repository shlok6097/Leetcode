import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            
            List<Integer> d = new ArrayList<>();
            while (cur > 0) {
                d.add(cur % 10);
                cur /= 10;
            }
            
            
            for (int j = d.size() - 1; j >= 0; j--) {
                ans.add(d.get(j));
            }
        }
        
        
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        
        return arr;
    }
}