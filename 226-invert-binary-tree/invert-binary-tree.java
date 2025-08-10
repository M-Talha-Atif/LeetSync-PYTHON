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
    public TreeNode invertTree(TreeNode root) {
        // for each node swap their left and right nodes
        if ( root != null ){
            TreeNode swap = root.left;
            root.left = root.right;
            root.right = swap;

            invertTree(root.right);
            invertTree(root.left);
        }
        return root;
    }
}