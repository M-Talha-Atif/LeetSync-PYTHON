/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {

    
        List<List<Integer>> explored = new LinkedList<List<Integer>>();

        if(root==null) return explored;


        Queue<Node> queue = new LinkedList<>();

     

        // offer, poll to remove
        queue.offer(root);

        while( !queue.isEmpty() ){
    
            List<Integer> localList = new LinkedList<>();
            int len = queue.size();
            // locally store size because it will change inside the loop

            for (int i=0; i<len; i+=1){
                Node curr = queue.poll();
                localList.add(curr.val);
                for(Node child : curr.children) { queue.offer(child);  }

            }

            explored.add(localList);

         }

         return explored;
        
    }
}