class MyQueue {

    Stack<Integer> data;

    // 1 2 
    // 

    public MyQueue() {
        data =  new Stack<>();  
    }
    // 1 --> 1
    // 2
    
    public void push(int x) {
        // add element to stack
        // 1 2
        // 2 1
        // reserver 
        Stack<Integer> temp = new Stack<>(); 
        // preserved old elements
        while (!data.isEmpty()){
            temp.push(data.pop());
        }

        // stack empty 
        data.push(x);
        
        // push reserved back to main stack
        while (!temp.isEmpty()){
            data.push(temp.pop());
        }
       
    }
    
    public int pop() {
       
        return data.pop();
        
        
    }
    
    public int peek() {
        return data.peek();
    }
    
    public boolean empty() {
        return data.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */