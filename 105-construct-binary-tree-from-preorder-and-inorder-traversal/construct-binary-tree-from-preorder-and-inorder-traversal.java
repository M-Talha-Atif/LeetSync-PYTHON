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
   int preIndex = 0;
Map<Integer, Integer> idxMap = new HashMap<>();

TreeNode buildTree(int[] preorder, int[] inorder) {
    preIndex = 0;
    idxMap.clear();
    for (int i = 0; i < inorder.length; i++) idxMap.put(inorder[i], i);
    return build(preorder, 0, inorder.length - 1);
}

TreeNode build(int[] preorder, int left, int right) {
    if (left > right) return null;

    int rootVal = preorder[preIndex++];
    TreeNode root = new TreeNode(rootVal);

    int mid = idxMap.get(rootVal);  // O(1)
    root.left = build(preorder, left, mid - 1);
    root.right = build(preorder, mid + 1, right);

    return root;
}
}