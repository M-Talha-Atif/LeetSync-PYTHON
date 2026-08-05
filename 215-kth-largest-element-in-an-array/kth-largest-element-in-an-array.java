class Solution {

    // min heap
    // 1 2, 3 comes, now
    // 2 3, 5 comes, now
    // 3 5, 6 comes, now
    // 5 6, now 4 comes 


    PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

    public int findKthLargest(int[] nums, int k) {
       
        for(Integer n :nums){
            add(n,k);
        }
        
       return heap.peek();
        
    }

     public void add(int val, int k) {
        heap.offer(val);


        if (heap.size() > k){
             heap.poll();
        }   
        
    }
}