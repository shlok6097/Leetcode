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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();
        findPath(root, ans, new StringBuilder());

        return ans;

    }

    private void findPath(TreeNode root, List<String> ans, StringBuilder sb) {
        if (root == null)
            return;

        int len = sb.length();
        sb.append(root.val+"->");

        if (root.left == null && root.right == null) {
            int k = sb.length();
            sb.delete(k-2,k);
            ans.add(sb.toString());
        }

        findPath(root.left, ans, sb);
        findPath(root.right, ans, sb);

        sb.setLength(len);

    }
}