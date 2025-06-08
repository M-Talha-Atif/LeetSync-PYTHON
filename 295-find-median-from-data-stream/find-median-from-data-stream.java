class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>( (a,b) -> b-a );

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        maxHeap.offer(num); // larger numbers
        minHeap.offer(maxHeap.poll()); // smaller numbers

        // Maintain size property (maxHeap should be equal or 1 larger than minHeap)
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
        
    }
    
    public double findMedian() {

        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } 
        else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
 

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */