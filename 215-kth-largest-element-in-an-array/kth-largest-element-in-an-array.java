class Solution {

    PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

    public int findKthLargest(int[] nums, int k) {
       
        for(Integer n :nums){
            add(n,k);
        }
        
       return heap.peek();
        
    }

     public void add(int val, int k) {

        if (heap.size() < k){
             heap.offer(val);
        }
        else if (heap.peek() < val ){
            // adding value , current peek
            System.out.println("Adding value: "+ String.valueOf(val));
            System.out.println("Current Peek: "+heap.peek().toString());

            heap.poll();
            heap.offer(val);

        }

      
        
    }
}