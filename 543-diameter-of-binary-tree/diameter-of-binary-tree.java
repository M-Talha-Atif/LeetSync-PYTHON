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
    int ans = 0;
     public  int height(TreeNode root) {
        if (root==null) return 0;
        int maxL =  height(root.left);
        int maxR =  height(root.right);
        this.ans = Math.max(this.ans, maxL+maxR);
        return Math.max(maxL,maxR) + 1;
        // 1 for current node
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);

        return this.ans;
        
    }
}