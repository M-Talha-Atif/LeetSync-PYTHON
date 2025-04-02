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
    int ans = -10000;
    
    public  int pathSum(TreeNode root) {
        if (root==null) return 0;
        int maxL = Math.max(pathSum(root.left),0);
        int maxR = Math.max(pathSum(root.right),0);
        this.ans = Math.max (this.ans , maxL+maxR+root.val);
        return root.val + Math.max(maxL,maxR);  
    }


    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return ans;
    }
}