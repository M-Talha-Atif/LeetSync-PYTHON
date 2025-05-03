class MinStack {
    PriorityQueue<Integer> data;
    Stack<Integer> myStack;


    public MinStack() {
        data = new PriorityQueue<Integer>();
        myStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        data.offer(val);
        myStack.push(val);
        
    }
    
    public void pop() {
        
        int popped = myStack.pop();
        data.remove(popped);
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {

        return data.peek();
        
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