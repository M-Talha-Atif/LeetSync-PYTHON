class StockSpanner {
    // price, 1
    // keep checking less values in a stack
    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
        
    }
    // keep removing less values than current value
    // 100 -- 1
    // 80 -- 1
    // 60 -- 1
    // 70 -- 2
    
    public int next(int price) {
        int res = 1; // when stack empty
        // check values being less than current stock price
        while (!stack.isEmpty() && stack.peek()[0] <= price ){
            res += stack.pop()[1];
        }

        stack.push( new int[] {price,res} );
        
        return res;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */