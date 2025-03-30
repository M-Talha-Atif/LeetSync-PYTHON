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
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> data = new LinkedList<Integer>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root==null) return data;
        que.offer(root);
        while(! que.isEmpty()){
            
            int size = que.size();
            // insert right then left
            for (int i =0; i<size; i+=1){
                TreeNode current = que.poll();
                if (i==0) {  data.add(current.val);  }

                  if(current.right!=null) {
                  que.offer(current.right);
            }
                if (current.left!=null){
                que.offer(current.left);
            }
           

            }
            
           
        }
        return data;
        
    }
}