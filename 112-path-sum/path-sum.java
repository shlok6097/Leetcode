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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
       int[] d = new int[1];
       d[0] = 0;
        
       // return helper(root , d,targetSum);
       return pathSum(root, targetSum);
        
    }
    private boolean helper(TreeNode root , int[] d ,int target){
        if(root == null) return false;

        d[0] += root.val;

        if(root.left == null && root.right == null){
            boolean isMatch = (d[0] == target);
            d[0] -=root.val;
            return isMatch;
        }
        boolean ls = helper(root.left, d, target);
        boolean rs = helper(root.right, d, target);
        d[0] -= root.val;

        return ls || rs;

        
    }


    private boolean pathSum(TreeNode root,int target){
        if(root == null) return false;

        Stack<TreeNode> queue = new Stack<>();
        Stack<Integer> st = new Stack<>();
        queue.push(root);
        st.push(root.val);



        while(!queue.isEmpty()){
            TreeNode temp = queue.pop();
            int tempSum = st.pop();

            if(temp.left == null && temp.right == null && tempSum == target) return true;

            if(temp.left != null){
                queue.push(temp.left);
                st.push(tempSum + temp.left.val);

            }
            if(temp.right !=  null){
                queue.push(temp.right);
                st.push(tempSum + temp.right.val);
            }

        }
        return false;
    }
}