class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // take frequency as a key in sorted array and value as a number
        // conver a map to a list and sort by frequency
        HashMap<Integer,Integer> frequencyMap = new HashMap<Integer,Integer>();
        // count each numbers frequency
        for ( int num : nums )
        {
                frequencyMap.put ( num, frequencyMap.getOrDefault(num, 0) + 1); 
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        list.sort( (a,b) -> b.getValue() - a.getValue() ); // sort by frequency

        int[] res = new int[k];
        for ( int i=0; i<k; i++){
            res[i] = list.get(i).getKey();
        }

        return res;



    
        
        
    }
}