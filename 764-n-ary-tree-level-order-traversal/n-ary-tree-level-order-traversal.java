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
        Queue<Node> que = new LinkedList<>();
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;
        que.offer(root);
        while ( !que.isEmpty() ){
            int countNodes = que.size();
            List<Integer> level = new ArrayList<>();
            for (int i=0; i<countNodes; i++)
            {
                Node peek = que.peek();

                for (Node child : peek.children){
                    if (child!=null)
                        que.offer(child);
                }

                // loop for children
                level.add( peek.val);
                // pop the top node after adding its children in que
                que.poll();

            }

            levels.add(level);
            
        }

        return levels;
        

    }
}