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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(inorder.length < 1 || preorder.length < 1) return null;


        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return buildTree(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1, map);

        
    }

    private TreeNode buildTree(int[] in , int is,int ie, int[] pr, int ps, int pe, Map<Integer, Integer> map){
        if(is > ie || ps > pe) return null;

        TreeNode root = new TreeNode(pr[ps]);
        int ir = map.get(pr[ps]);
        int left = ir - is;

        root.left = buildTree(in,is, ir-1, pr,ps+1, ps+left,map);
        root.right = buildTree(in, ir+1, ie, pr, ps+left+1,pe, map);

        return root;
    }
}