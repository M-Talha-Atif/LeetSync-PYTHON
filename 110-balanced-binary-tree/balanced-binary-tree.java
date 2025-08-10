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
    // depth for each node
    // comparing then
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        
        int maxLeft = maxDepth( root.left );
        int maxRight = maxDepth( root.right );
        int difference = Math.abs(maxLeft - maxRight);
        if ( difference > 1){
            return false;
        }


        boolean a1 = isBalanced(root.left);
        boolean a2 = isBalanced(root.right);

        return a1 == true && a2 == true;
        
    } 

    public int maxDepth(TreeNode root) {
        // check the last nodes as a case
        // take node as a explore case 
        // max left or max right
        // each node counts as 1
        
        if ( root == null){
            return 0;
        }
        int maxLeft = maxDepth( root.left );
        int maxRight = maxDepth( root.right );

        return Math.max(maxLeft,maxRight) + 1;
    }
}