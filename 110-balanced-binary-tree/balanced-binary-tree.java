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
    public boolean isBalanced(TreeNode root) {
        int k = helper(root);

        if(k !=-1) return true;

        return false;
    }
    private int helper(TreeNode root){
        if(root == null) return 0;
        int lh = helper(root.left);
        int rh = helper(root.right);
        if(Math.abs(lh-rh) >1) return -1;
        if(lh == -1 || rh == -1) return -1;

        return 1+Math.max(lh,rh);
    }
}