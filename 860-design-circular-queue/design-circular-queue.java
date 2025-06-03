class MyCircularQueue {

    LinkedList<Integer> data = new LinkedList<Integer>();
    int myK = 0;
    public MyCircularQueue(int k) {
        myK = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        data.add(value);

        return true;
        
    }
    
    public boolean deQueue() {

        if ( isEmpty()){
            return false;
        }
        data.poll();
    

        return true;
    }
    
    public int Front() {

        if( !isEmpty()){
            return data.getFirst();
        }

        return -1;
        
    }
    
    public int Rear() {

        
        if (  !isEmpty()   )  {
            return data.getLast();
        }

        return -1;
        
    }
    
    public boolean isEmpty() {
        return data.size()==0;
    }
    
    public boolean isFull() {

        return myK==data.size();
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */