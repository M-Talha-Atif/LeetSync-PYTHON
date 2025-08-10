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