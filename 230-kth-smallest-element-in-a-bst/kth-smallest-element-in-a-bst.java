/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {

        List<Integer> ls = new ArrayList<>();

        // inorder(root , ls);
        // Collections.sort(ls);

        // return ls.get(k-1);

        int [] ans = new int[2];
        inorder(root , ans,k);
        return ans[0];
        
    }

    private void inorder(TreeNode root , List<Integer> ls){
        if(root == null) return ;

        inorder(root.left, ls);
        ls.add(root.val);
        inorder(root.right ,ls);
    }
      private void inorder(TreeNode root , int[] ans  , int k){
        if(root == null) return ;
        

       

        inorder(root.left, ans , k);
        ans[1]++;

         if(ans[1] == k ){
            ans[0] = root.val;
            return;
        }
        
        inorder(root.right ,ans , k);
    }
}