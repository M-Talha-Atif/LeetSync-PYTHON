/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null){
            return "Null";
        }

        return root.val + "," + serialize(root.left) + "," + serialize(root.right) ;
        
    }
    private TreeNode helping(Queue<String> que){
        String top = que.poll();
        if( top==null || top.isEmpty() || top.equals("Null")) return null;
        TreeNode root = new TreeNode(Integer.valueOf(top));
        root.left = helping(que);
        root.right = helping(que);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        Queue<String> que = new LinkedList<> (Arrays.asList(data.split(",")));

        return helping(que);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));