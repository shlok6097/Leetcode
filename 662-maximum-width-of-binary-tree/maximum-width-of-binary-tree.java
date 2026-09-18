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

 class Pair{
    TreeNode node;
    int num ;
    Pair(TreeNode node , int num){
        this.node = node;
        this.num = num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
         if(root == null) return 0;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root,0));
        int ans = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int st = 0;
            int end = 0;
            int minNum = q.peek().num;
            

            for(int i =0; i<size ; i++){
                TreeNode cur = q.peek().node;
                int curNum = q.peek().num-minNum;
                q.poll();

                if(i==0) st = curNum;
                if(i== size-1) end = curNum;


                if(cur.left != null){
                    q.add(new Pair(cur.left, curNum *2 +1));

                }
                 if(cur.right != null){
                    q.add(new Pair(cur.right, curNum *2 +2));

                }
            }
            ans = Math.max(ans, end-st+1);
        }
        return ans;
    }
}