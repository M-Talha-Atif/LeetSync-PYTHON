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
        Queue<TreeNode> que = new LinkedList<>();
        List<Integer> level = new LinkedList<Integer>();
        // add nodes in the que
        if (root!=null)
           que.offer(root);
           
        while ( !que.isEmpty() ){
            
            int countNodes = que.size();
            for ( int i=0; i<countNodes;  i++){

                // need to acces only right side

                if ( i == 0){
                    // explored node adding in list
                    level.add (  que.peek().val );
                }
                // add its children in the que
                if ( que.peek().right != null ){
                    que.add( que.peek().right  );
                }
                if ( que.peek().left != null ){
                    que.add( que.peek().left  );
                }

                que.poll();
               
              
            }

        }

        return level;
        
    }
}