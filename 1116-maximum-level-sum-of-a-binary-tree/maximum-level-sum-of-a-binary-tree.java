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
    public int maxLevelSum(TreeNode root) {
        if(root == null ) return 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int maxSum = root.val;
        int curLevel = 1;
        int maxLevel = curLevel;

        while(!queue.isEmpty()){
            int size = queue.size();
            int sum =0;

            for(int i =0; i<size; i++){
                TreeNode cur = queue.poll();
                sum += cur.val;
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
            }
            
            if(maxSum < sum){
                maxSum = sum;
                maxLevel = curLevel;

            }
            curLevel++;
        }

        return maxLevel;
        
    }
}