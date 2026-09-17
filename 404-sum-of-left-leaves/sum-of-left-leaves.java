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
    public int sumOfLeftLeaves(TreeNode root) {

        int[] d = new int[1];

        findSum(root, d ,false);
        return d[0];

       
        
    }
     private void findSum(TreeNode root , int[] d , boolean isLeft){
        if(root == null )return;

        if(root.left == null && root.right == null && isLeft){
            d[0] += root.val;
        }
        findSum(root.left, d ,true);
        findSum(root.right , d , false);

        
     }
}