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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        
    if(postorder.length < 1 || preorder.length < 1) return null;


        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<postorder.length; i++){
            map.put(postorder[i], i);
        }

        return buildTree(postorder, 0, postorder.length-1, preorder, 0, preorder.length-1, map);

        
    }

    private TreeNode buildTree(int[] post , int is,int ie, int[] pre, int ps, int pe, Map<Integer, Integer> map){
        if(is > ie || ps > pe) return null;

       TreeNode root = new TreeNode(pre[ps]);
        if (ps == pe) return root; 

        
        int leftRootVal = pre[ps + 1];
        int leftRootIdx = map.get(leftRootVal);
        int leftSize = leftRootIdx - is + 1;

        root.left = buildTree(post, is, leftRootIdx, pre, ps + 1, ps + leftSize, map);
        root.right = buildTree(post, leftRootIdx + 1, ie - 1, pre, ps + leftSize + 1, pe, map);

        return root;
    }
}