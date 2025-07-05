class Solution {
    public int findLucky(int[] arr) {
        // frequency equals to the value
        // returning largest of them
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>
        ( (a,b) -> { return b-a; } );
        for(int item : arr){
            freq.put(item, freq.getOrDefault(item,0) + 1);
            maxHeap.offer(item);
        }
        while(!maxHeap.isEmpty()){
            int element = maxHeap.poll();
            if (freq.get(element) == element){
                return element;
            }
        }

        return -1;
        


        
    }
}