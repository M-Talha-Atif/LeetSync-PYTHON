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
    public TreeNode deleteNode(TreeNode root, int key) {
 
        if (root!=null) {

            if ( root.val > key )
            {
                root.left = deleteNode(root.left, key);

            }
            else if ( root.val < key )
            {
                root.right = deleteNode(root.right, key);

            }
            else {
                // single node as child
                // both empty
                if ( root.right == null && root.left == null){
                    return root.left;
                }
                // single node
                if ( root.left == null ){
                    return root.right;
                }
                // single node
                else if ( root.right == null){
                    return root.left;
                }
                // both nodes are not empty
                TreeNode temp = root.left;
                // find big node in left subtree
                // big node right end
                while (temp.right!=null){
                    temp = temp.right;
                }
                root.val = temp.val; // node to be replaced for deleted
                // delete the duplicate node
                root.left = deleteNode(root.left, temp.val);


            }

        }

        return root;

        
    }
}