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
    List<Integer> data = new LinkedList<>();
    public void check(TreeNode root) {
        if (root==null) return;
        check(root.left);
        data.add(root.val);
        check(root.right);
    }


    public int kthSmallest(TreeNode root, int k) {

        check(root);

        return data.get(k-1);
        
    }
}