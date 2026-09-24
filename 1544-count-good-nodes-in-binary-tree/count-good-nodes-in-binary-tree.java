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
    int ans ;
    public int goodNodes(TreeNode root) {
       


        preorder(root ,root.val);
        return ans;


        
    }
    private void  preorder(TreeNode root, int max ){

        if(root == null)return;

        if(root.val >= max){
            ans++;
            max = root.val;
        }
        preorder(root.left , max);
        preorder(root.right , max);
    }
}