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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // edge cases
        if ( p == null && q==null){
            return true;
        }
        if ( p == null && q!=null  ){
            return false;
        }
        if ( p != null && q==null  ){
            return false;
        }
        if ( p.val != q.val ){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
          return false;
        boolean r1 = isSameTree( root, subRoot);
        boolean r2 = isSubtree( root.left, subRoot);
        boolean r3 = isSubtree( root.right, subRoot);

        return r1 || r2 || r3;
        
    }
}