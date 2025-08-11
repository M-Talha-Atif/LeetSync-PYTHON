/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // node will be returned so storing the node will be here
    // node value if greater than both p,q then recurs to left
    // node value if less than both p,q then recurs to right
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return root;
        }
        // conditions on matching
        if ( root.val > p.val && root.val > q.val){
            // look for smaller
            TreeNode left = lowestCommonAncestor( root.left, p, q);
            if  (left!=null ){
                return left;
            }
        }
        else if ( root.val < p.val && root.val < q.val){
            // look for greater
            TreeNode right = lowestCommonAncestor( root.right, p, q);
            if  ( right !=null )
            {
                return  right;
            }
        }

        return root;
        
    }
}