class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // counter for counting elements
        Map<Integer, Integer> counter = new HashMap<> ();
        List<Integer>[] bucket = new List[nums.length + 1];

        // storing the count
        for(int n : nums){
            counter.put(n, counter.getOrDefault(n,0) + 1);
        }

        for(int key : counter.keySet()){
            int freq = counter.get(key);
            if(bucket[freq] == null ) {bucket[freq]= new ArrayList<>() ;}
            
            bucket[freq].add(key);
        }

        List<Integer> result = new ArrayList<>();


        for(int start = bucket.length-1; start>=0 && result.size()<k ; start-=1){

            if(bucket[start] != null){
    
                result.addAll(bucket[start]);
            }
        }

        // to convert the list into array

        return result.stream().mapToInt(Integer::intValue).toArray();

    
        
    }
}