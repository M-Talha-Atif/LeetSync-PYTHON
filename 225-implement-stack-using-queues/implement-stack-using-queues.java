class MyStack {
    
    // 1 2 3 4 5 
    Queue<Integer> data;
    int top;

    public MyStack() {
        data =  new LinkedList<>();
        top = 0;
        
    }
    
    public void push(int x) {

        data.offer(x);
        top = x;
        
    }
    
    public int pop() {

        ArrayList<Integer> gotList = new ArrayList<Integer>();
        int popped = 0;




        while(!data.isEmpty()) {
            int element = data.poll();
            gotList.add(element);
            popped = element;
        }

        // 1 2 3 4 5 6
        // 1 2 3 4 5
        for(int i=0; i< gotList.size() - 1; i++) {
            int element = gotList.get(i);

            data.offer(  element );
            top  = element;

        } 

        return popped;
        
    }

    
    public int top() {

        return top;
        
    }
    
    public boolean empty() {

        return data.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */