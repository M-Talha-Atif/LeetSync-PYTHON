class MyQueue {

    Stack<Integer> data;
    int top;

    // 1 2 3 4 5 6

    public MyQueue() {
        data =  new Stack<>();
        top = 0;
        
    }
    
    public void push(int x) {
        // add element to stack

        if(data.isEmpty()){
            top = x;
        }

        data.push(x);

       
    }
    
    public int pop() {
        ArrayList<Integer> gotList = new ArrayList<Integer>();

        int popped = 0;


    // 1 2 3 4 
    // 4 3 2 1

    // 2 3 4

    

        while(!data.isEmpty()) {

            int element = data.pop();

            gotList.add(element);

            top  = popped; // previous element than popped

            popped = element;
        }

        // 4 3 2 || 1

        // 4 3 2

        // 5 4 3 2 -- 1
        //  
        // 6 5 4 3 2 
        // skip element from last one

        // stack like 1 2 3 4 5
        // in list 5 4 3 2 1
        // so start from 2nd last by skipping last element and go upto the end till 5
        // 2 3 4 5 -> again stack like 2 3 4 5
        // top is 5
        // System.out.println(gotList);
        for(int i=gotList.size() - 2; i >= 0 ; i--) {
            int element = gotList.get(i);

            data.push(  element );

            

        } 

        return popped;
        

        
    }
    
    public int peek() {
        return top;
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