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
    // in order tells counts of nodes at left and right
    int postIndex = 0;
    Map<Integer, Integer> idxMap = new HashMap<>();


    public TreeNode buildTree(int[] inorder, int[] postorder) {
    postIndex = postorder.length - 1;
    for (int i = 0; i < inorder.length; i++) idxMap.put(inorder[i], i);
    return build(postorder, 0, inorder.length - 1);
        
    }
    private TreeNode build(int[] postorder, int left, int right){
        if ( left > right ) { return null; } // if left greater than right then stop
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode( rootVal );
        int mid = idxMap.get( rootVal );
        root.right  = build(postorder, mid + 1, right );
        root.left = build(postorder, left, mid - 1); 

        return root; // return root

    }
}