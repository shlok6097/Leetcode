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
    public int sumNumbers(TreeNode root) {

        List<String> ls = new ArrayList<>();
        findPath(root, ls, new StringBuilder());

        return findSum(ls);
        
    }
    private void findPath(TreeNode root , List<String> ls, StringBuilder sb){
        if(root == null) return;

        int len = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right == null){
            ls.add(sb.toString());


        }
        findPath(root.left, ls,sb);
        findPath(root.right, ls, sb);
        sb.setLength(len);
    }

    private int findSum(List<String> ls){
        int ans = 0;

        for(String s : ls){

            int res = Integer.parseInt(s);
            ans += res;

        }
        return ans;
    }

}