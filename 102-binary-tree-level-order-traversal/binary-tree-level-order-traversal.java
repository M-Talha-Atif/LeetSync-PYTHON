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
    // every node added in que, its children being added in the que and node in the list
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> levels = new LinkedList<List<Integer>>();


        // add nodes in the que
        if (root!=null)
           que.offer(root);
           
        while ( !que.isEmpty() ){
            List<Integer> level = new LinkedList<Integer>();
            int countNodes = que.size();
            for ( int i=0; i<countNodes;  i++){

                // add its children in the que
                if ( que.peek().left != null ){
                    que.add( que.peek().left  );
                }
                if ( que.peek().right != null ){
                    que.add( que.peek().right  );
                }
                // explored node adding in list
                level.add (  que.poll().val );
            }
            levels.add(level);

        }

        return levels;
        
    }
}