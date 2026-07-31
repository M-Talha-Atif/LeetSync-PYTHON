class MyHashSet {

    int bucketSize = 769;
    LinkedList<Integer>[] buckets;
    

    public MyHashSet() {
        buckets = new LinkedList[bucketSize];

        for (int i=0; i<bucketSize; i++){
            buckets[i] = new LinkedList<>();
        }
        
    }

    private int hash(int key) {
        return key % bucketSize;
    }
    
    public void add(int key) {
        int bucketIndex = hash(key);

        if (!buckets[bucketIndex].contains(key)) {
            buckets[bucketIndex].add(key);
        }
        
    }
    
    public void remove(int key) {
        int bucketIndex = hash(key);

        buckets[bucketIndex].remove(Integer.valueOf(key));
        
    }
    
    public boolean contains(int key) {

        int bucketIndex = hash(key);

        return buckets[bucketIndex].contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */