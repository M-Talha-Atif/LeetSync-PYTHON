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
    public List<List<Integer>> levelOrder(TreeNode root) {
         Queue<TreeNode> queue = new LinkedList<>();
         List<List<Integer>> explored = new LinkedList<List<Integer>>();
         if(root==null) return explored;
         // offer, poll to remove
         queue.offer(root);
         while(!queue.isEmpty()){
            int countNodes = queue.size();
            List<Integer> localList = new LinkedList<Integer>();

            for(int i = 0; i<countNodes; i+=1){
            // add childs of current node in queue

            if (queue.peek().left!=null) queue.offer(queue.peek().left);
            if (queue.peek().right!=null) queue.offer(queue.peek().right);
            // remove the current node and add its value in list
            localList.add(queue.poll().val);

            }
            explored.add(localList);

         }

         return explored;


        
    }
}