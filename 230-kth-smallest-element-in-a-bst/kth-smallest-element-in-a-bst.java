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
    public int kthSmallest(TreeNode root, int k) {
        // use stack, in order traversal
        Stack<TreeNode> data = new Stack<TreeNode>();
        while (root!=null || !data.isEmpty()){
            while (root!=null){
                data.push(root);
                root = root.left;
            }
            root = data.pop(); // new root node
            if (--k == 0 ) return root.val;
            root = root.right;
        }

        return data.pop().val;

        
    }
}