class TimeMap {

     class Pair {
        int time;
        String s;
        Pair (int time, String s) {
            this.time = time;
            this.s = s;
        }
    }
    HashMap<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if ( !map.containsKey(key) ){
            map.put( key, new ArrayList<>() );
        }
        map.get(key).add( new Pair(timestamp,value) );
        
    }
    
    public String get(String key, int timestamp) {
          if ( !map.containsKey(key) ){
           return "";
        }

        return BinarySearch( map.get(key), timestamp);

        
        
    }
       public String BinarySearch(List<Pair> array, int limit) {
        int left = 0, right = array.size() - 1, idx = -1;
        while (left <= right) {
            // only return timestamp value if there are values greater or equal
            // will return first higher value so upper bound here
            int mid = left + (right - left) / 2;
            if (array.get(mid).time <= limit) {

                idx = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
                // right = mid;
            }
        }
        return idx == -1 ? "" : array.get(idx).s;
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */