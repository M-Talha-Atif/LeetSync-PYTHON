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

    public boolean isValidBST(TreeNode root) {
           check(root);

           for (int i=1; i <data.size(); i+=1){
               if (data.get(i-1) >= data.get(i)){
                  return false;
               }
              
           }
           return true;
        
    }
}