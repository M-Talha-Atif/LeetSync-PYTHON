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
    List<Integer> data = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if ( root == null ){
           return data;
        }
        postorderTraversal(root.left);
     
        postorderTraversal(root.right); 

        data.add(root.val);
        
        // will execute for last one
        return data; 
        
    }
}