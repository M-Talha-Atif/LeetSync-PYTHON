class KthLargest {

    final PriorityQueue<Integer> minHeap;
    final int k ;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);
        for(Integer n : nums){
            add(n);
        }
    }
    
    public int add(int val) {

        if (minHeap.size() < k){
             minHeap.offer(val);
        }
        else if (minHeap.peek() < val ){
            // adding value , current peek
            System.out.println("Adding value: "+ String.valueOf(val));
            System.out.println("Current Peek: "+minHeap.peek().toString());

            minHeap.poll();
            minHeap.offer(val);

        }

        return minHeap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */