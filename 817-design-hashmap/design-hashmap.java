class MyHashMap {

    /* 
    For simplicity, are the keys integers only?
    For collision resolution, can we use chaining?
    Do we have to worry about load factors?
    Can we assume inputs are valid or do we have to validate them?
    Can we assume this fits memory?
    */

    int[] data;

    public MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }

    public void put(int key, int val) {
        data[key] = val;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */