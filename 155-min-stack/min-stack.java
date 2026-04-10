class MinStack {
    Node head;
    static class Node {
        int val;
        int minimum;
        Node next;
        public Node( int val, int minimum, Node next){
            this.val = val;
            this.minimum = minimum;
            this.next = next;
        }
    }

    public MinStack() {
        head = null;
    }

    // insert new node if head is null make new node
    
    public void push(int val) {
        if (head == null){
            head = new Node(val,val,null); // next will be null
        }
        else {
            int minimum = Math.min( val, head.minimum);
            head = new Node( val, minimum, head); // next is old head and new head is formed
        }
        
    }
    
    public void pop() {
        // push one node to next for removing value
        head = head.next;
    }
    
    public int top() {
        return head.val;
        
    }
    
    public int getMin() {
        return head.minimum;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */