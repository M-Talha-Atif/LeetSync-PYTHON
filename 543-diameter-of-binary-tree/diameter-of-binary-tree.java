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
    // height function
    // left tree height + right tree height'
    // maximum take due to any root can hold value of diameter
    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        // every sub tree can give answer
        // edge case : root having left only one node and at right many nodes as a subtree
        if (root == null){
            return 0;
        }
        height(root);

        return ans;

        
    }

    public int height(TreeNode root){
        if ( root == null){
            return 0;
        }

        int maxLeft  =  height( root.left );
        int maxRight =  height( root.right );
        ans = Math.max(this.ans, maxLeft+maxRight);
        return Math.max(maxLeft,maxRight) + 1;
    }
}