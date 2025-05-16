class StockSpanner {

   Stack<int[]> stack = new Stack<>();

    public StockSpanner() {
        stack = new Stack<>();
        
    }
    // key-value

    // key price , res prices less than key, monotonic stack
    // next values less than key
    
    public int next(int price) {
        // storing the result after the loop
        int res = 1;

        while(  !stack.isEmpty() && stack.peek()[0]  <= price ){
            res += stack.pop()[1];
        }

        stack.push(new int[]{price,res});

        return res;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */