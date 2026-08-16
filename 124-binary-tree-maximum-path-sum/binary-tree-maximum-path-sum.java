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
    public int maxPathSum(TreeNode root) {
        
      int[] d = new int[1];
      d[0] = Integer.MIN_VALUE;
     // if(root.left == null && root.right == null ) return root.val;
        helper(root ,d);
        return d[0];
        
    }
    private int helper(TreeNode root , int[] d){
        if(root == null) return 0;

        int lh = Math.max(0,helper(root.left , d));
        int rh = Math.max(0,helper(root.right , d));
        d[0] = Math.max(d[0], lh+rh+root.val);

        return root.val + Math.max(lh,rh);
    }
}