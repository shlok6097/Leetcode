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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();

        findPath(root,targetSum, ans, new ArrayList());

        return ans;
      
        
    }
    private void findPath(TreeNode root, int sum,List<List<Integer>> ans , List<Integer> cur){
        if(root == null)return;

        cur.add(root.val);

        if(root.left == null && root.right == null && sum - root.val == 0){
            ans.add(new ArrayList(cur));
        }
        findPath(root.left,sum-root.val,ans,cur);
        findPath(root.right,sum-root.val,ans,cur);

        cur.remove(cur.size()-1);
    }
    
  
}