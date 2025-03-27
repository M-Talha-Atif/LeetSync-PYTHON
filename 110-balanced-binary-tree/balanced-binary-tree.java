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
    public int maxDepth(TreeNode root){
        // base case
        if (root==null) return 0;
        // recurssion
        int maxL = maxDepth(root.left);
        int maxR = maxDepth(root.right);
        return Math.max(maxL,maxR) + 1;
    }
    
    public boolean checkBalanced(TreeNode root) {
        if (root==null) return true;
        
        int took1 = maxDepth(root.left);
        int took2 = maxDepth(root.right);
        if (Math.abs(took1-took2)>1){
            return false;
        }
        // explore for every node
        return checkBalanced(root.left) && checkBalanced(root.right);
    }

    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;

    
        return checkBalanced(root);
    }
}