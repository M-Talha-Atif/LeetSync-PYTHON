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

class MyHashMap {
    private static final int SIZE = 100000; // Smaller size for simplicity
    private ListNode[] buckets;
    
    public MyHashMap() {
        buckets = new ListNode[SIZE];
    }
    
    // Simple hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // 3 cases
    // first key not in linked list
    // updatin the value of key linked list
    // new key in same linked list
    
    public void put(int key, int value) {
        int index = hash(key);
        
        // If bucket is empty, just add new node
        if (buckets[index] == null) {
            buckets[index] = new ListNode(key, value);
            return;
        }
        
        // Otherwise, check if key exists
        ListNode current = buckets[index];
        ListNode prev = null;
        
        while (current != null) {
            if (current.key == key) {
                // Update existing key
                current.value = value;
                return;
            }
            prev = current;
            current = current.next;
        }
        
        // Key doesn't exist, add to end of list
        prev.next = new ListNode(key, value);
    }
    
    public int get(int key) {
        int index = hash(key);
        ListNode current = buckets[index];
        
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        
        return -1; // Not found
    }
    
    public void remove(int key) {
        int index = hash(key);
        ListNode current = buckets[index];
        ListNode prev = null;
        
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    // Remove head of list
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}