class MinStack {
    int myMin = Integer.MAX_VALUE;
    Stack<Integer> myStack;

    // current value is maintained with previous minimum


    public MinStack() {
        
        myStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(val<=myMin){
         myStack.push(myMin);
         myMin = val; // update the minimum

        }
        
        myStack.push(val);

        // System.out.println(myStack);
        
    }
    
    public void pop() {
        
        int popped = myStack.pop();
        if(popped == myMin){
            myMin = myStack.pop();
        }

    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {

        return myMin;
        
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