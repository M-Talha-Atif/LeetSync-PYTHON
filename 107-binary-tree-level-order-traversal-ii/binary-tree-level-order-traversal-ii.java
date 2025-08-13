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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null ) return levels;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);



        while ( !que.isEmpty() ) // run till que is not empty
        {   
            // total nodes count
            int countNodesInQue = que.size();
            // a level 
            List<Integer> level = new ArrayList<>();
            for (int i=0; i<countNodesInQue; i++){

                TreeNode peek = que.peek();
                // add childs
                if (peek.left!=null) que.offer( peek.left );
                if (peek.right!=null) que.offer( peek.right );
                level.add( peek.val );
                que.poll(); // remove

            }
            // this adds the list at start and other pushing to right
            levels.add(0, level);
        }

        return levels;
        
    }
}