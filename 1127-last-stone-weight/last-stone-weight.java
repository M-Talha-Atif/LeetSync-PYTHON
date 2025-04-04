class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(((a,b) -> b-a));
        for(Integer stone : stones){
            minHeap.offer(stone);
        }

        while( minHeap.size()>1 ){
            Integer a = minHeap.poll();
            Integer b = minHeap.poll();
            Integer smash = Math.abs(a-b);
            if (smash>0)
               minHeap.offer(smash );

        }

        if(minHeap.size()==0){
            return 0;
        }
        return minHeap.peek();


        
    }
}