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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
           if (root==null) return root;

           // value found ni hue to recursion marty rhu
        
           if (root.val>p.val && root.val>q.val){
             TreeNode left =  lowestCommonAncestor(root.left,  p, q);
             if (left!=null) return left;
           }
           
           if (root.val<p.val && root.val<q.val){
              TreeNode right = lowestCommonAncestor(root.right,  p, q);
              if (right!=null) return right;
           }
        // found value pa return krdu result
           return root;

    }
}