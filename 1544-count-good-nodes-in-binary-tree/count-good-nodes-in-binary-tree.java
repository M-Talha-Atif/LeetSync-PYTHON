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
    int count = 0;

    public int goodNodes(TreeNode root) {
        if (root == null ){
            return 1;
        }
        goodNodes( root, root.val);
        return count;
      
    }
    public void goodNodes(TreeNode root, int currentMaximum) {
        if (root == null ){
            return;
        }
        if  (root.val>=currentMaximum ){
            count+=1;
        }
        int passingValue = Math.max( currentMaximum, root.val );

        goodNodes(root.left,passingValue);
        goodNodes(root.right,passingValue);
      
    }
}