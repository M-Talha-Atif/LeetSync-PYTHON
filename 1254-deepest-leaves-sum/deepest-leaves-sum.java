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

     public int answer(TreeNode root){
        if (root==null) return 0;

        Queue<TreeNode> que = new LinkedList<TreeNode>();

        int total = 0;
        que.offer(root);

        while(!que.isEmpty()){
            
            int size = que.size();
      

            int localCount = 0;
            boolean check = true;
            for(int i=0; i<size; i++) {
                TreeNode peeking = que.peek();

                if (peeking.left!=null || peeking.right!=null){
                    check = check & false;
                }
                if(peeking.left!=null) que.offer(peeking.left);
                if(peeking.right!=null) que.offer(peeking.right);

                que.poll();

                localCount+=peeking.val;
            }

            if(check) {
                total = localCount;
            }
            else {
                localCount = 0;
            }
     
        }

        return total;

        
    }

    public int deepestLeavesSum(TreeNode root) {
    
        return answer(root);

        
    }
}