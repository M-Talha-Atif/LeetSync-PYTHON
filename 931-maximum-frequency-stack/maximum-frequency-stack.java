class FreqStack {
    // using a stack to track most frequent element
    // using a map to keep track of frequency
    // a map with a key as integer and value as a stack
    // so in this map key will be frequency and values will be elements
    // like for 12,14,12,14
    // 1 --> 12.14
    // 2 --> 12.14
    HashMap<Integer,Integer> freqMap = new HashMap<>();
    HashMap<Integer, Stack<Integer>> stackMap = new HashMap<>();
    int maxFreq =0 ;

    public FreqStack() {
    }
    
    public void push(int val) {
        int f = freqMap.getOrDefault( val, 0 ) + 1; // increment by 1 if not then it will be 0+1 else x+1
        freqMap.put( val , f);
        maxFreq = Math.max( maxFreq, f);
        if  ( !stackMap.containsKey(f) ) stackMap.put(f, new Stack<Integer>());
        stackMap.get(f).push(val);  
    }
    
    // take out the maximum element of the max freq from the stack
    // decrement in freqmap
    // if max frequency in the stack got 0 remove it
    public int pop() {
       int element = stackMap.get(maxFreq).pop();
       freqMap.put( element, maxFreq - 1);
       if (stackMap.get(maxFreq).size() == 0) maxFreq-=1;

       return element;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */