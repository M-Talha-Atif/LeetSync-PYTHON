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
    public TreeNode helper(int[] preorder, int[] inorder, int[] rootIndex, int left, int right){
           if (left>right){
            return null;
           }
           int pivot = left;

           while(  inorder[pivot] != preorder[rootIndex[0]]  ) pivot+=1;

           rootIndex[0]+=1;

           TreeNode newNode = new TreeNode(inorder[pivot]);

           newNode.left = helper(preorder,inorder,rootIndex,left,pivot-1);

           newNode.right = helper(preorder,inorder,rootIndex,pivot+1,right);

           return newNode;



    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int[] rootIndex = {0};
        return helper(preorder,inorder,rootIndex,0,inorder.length-1);

    }
}