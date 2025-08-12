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
    // in order traversal
    // storing the prev node
    // using the stack
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {

        if ( root == null ){
            return true;
        }

        boolean r1 = isValidBST(root.left);
        if ( r1  == false ) {
            return false;
        }
        if ( prev!=null && prev.val >= root.val ){
            return false;
        }
        prev = root;
        boolean r2 = isValidBST(root.right);
        if ( r2  == false ){
            return false;
        }

        return true;
        
    }
}