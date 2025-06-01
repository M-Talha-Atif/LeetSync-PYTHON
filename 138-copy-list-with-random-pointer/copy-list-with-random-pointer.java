/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

// First of all, I've to make the new nodes
// Point out the random pointers for new nodes using same original list
// Separate out the random and original nodes 

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {return head;}
        Node current = head;
        while( current!= null){
            // 1 -> 1* -> 2 -> 2*
            Node next = current.next;
            current.next = new Node(current.val);
            current.next.next = next;
            current = next;
        }
        current = head;
        while( current!= null){
            // 1 -> 1* -> 2 -> 2*
            if (current.random!=null ){
                current.next.random = current.random.next;
            }
            current = current.next.next;     
        }

        current = head;
        Node copy = head.next;
        Node random = copy;
        // 1 -> 2 -> 3 -> 4
        // 1* -> 2* -> 3 * -> 4*
        while ( random.next != null ) {
            // original list
            current.next = current.next.next;
            current = current.next;
            // copied list
            random.next = random.next.next;
            random = random.next;
        }
        // for last node of original list
        current.next = current.next.next;

        return copy;
        
    }
}