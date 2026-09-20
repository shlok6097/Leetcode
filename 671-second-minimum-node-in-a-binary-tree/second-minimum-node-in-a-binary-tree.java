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
    public int findSecondMinimumValue(TreeNode root) {

        Set<Integer> ans = new TreeSet<>();

        inorder(root, ans);

        if (ans.size() == 1)
            return -1;
        Iterator<Integer> it = ans.iterator();

        it.next(); 
        int second = it.next();
        return second;

    }

    private void inorder(TreeNode root, Set<Integer> ans) {
        if (root == null)
            return;

        inorder(root.left, ans);
        ans.add(root.val);

        inorder(root.right, ans);
    }
}