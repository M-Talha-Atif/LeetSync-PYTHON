class MyHashMap {
   class ListNode {
    int key;
    int value;
    ListNode next;
    
    public ListNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}


    private ListNode[] buckets;
    int SIZE = 100000;

    public MyHashMap() {

        buckets = new ListNode[SIZE];

    }

     // Simple hash function
    private int hash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int hashKey = hash(key);
        if ( buckets[hashKey] == null) {
           buckets[hashKey] = new ListNode(key,value);
           return; // new node, as head
        }

        // check if key already exists
        ListNode prev = null;
        ListNode current = buckets[hashKey];
        // find null so that new node can be added
        while ( current != null ){
            if ( current.key == key ){
                current.value = value; // replace the value of that key, update
                return;
            }
            prev = current;
            current = current.next; // move to next node
        }
        // add a new node
        prev.next = new ListNode(key,value);
    }
    
    public int get(int key) {
        int hashKey = hash(key);
         if ( buckets[hashKey] == null) {
           return -1; // not present
        }

        ListNode current = buckets[hashKey];
        // find null so that new node can be added
        while ( current != null ){
            if ( current.key == key ){
                return current.value;
            }
            current = current.next; // move to next node
        }

        return -1;
        
    }
    
    public void remove(int key) {
        int hashKey = hash(key);

         // check if key already exists
        ListNode prev = null;
        ListNode current = buckets[hashKey];
        // find null so that new node can be added
        while ( current != null ){
            if ( current.key == key ){
                if ( prev == null ){
                    // key as head
                    buckets[hashKey] = current.next;
                } // it will be in the middle
                else {
                    prev.next = prev.next.next;
                }
                
                return;
            }
            prev = current;
            current = current.next; // move to next node
        }

        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */