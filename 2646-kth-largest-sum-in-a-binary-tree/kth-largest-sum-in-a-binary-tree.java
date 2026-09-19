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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null ) return 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        ArrayList<Long> ans = new ArrayList<>();
        

        while(!queue.isEmpty()){
            int size = queue.size();
            long sum =0;

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
            ans.add(sum);
            
            
            
        }
        Collections.sort(ans);
        if(k>ans.size()) return -1;

        return ans.get(ans.size() - k);
        
    }
}