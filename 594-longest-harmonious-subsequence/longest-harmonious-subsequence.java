class Solution {
    public int findLHS(int[] nums) {
        // sub sequence
        // maximum - minimum is 1

        // 1,3,2,2,5,2,3,7
        // {1,3}
        // 1 is 2 exists? no, put in map
        // 3 is 4 exits ? no, put in map
        // 2 is 3 exists? yes, freq[2] + freq[3] -> is 2
        // 2 is 3 exists? yes, freq[2] + freq[3] -> is 3
        // 5 is 6 exists? no, put in map
        // 2 is 3 exists? yes, freq[2] + freq[3] -> is 4
        // 3 is 4 exists? no, put in map

        int length = 0;
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for ( int num : nums )
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1); // put current number frequency in map
            int nextNumberFrequency = freq.getOrDefault(num+1, -1);
            int prevNumberFrequency = freq.getOrDefault(num-1, -1);
            int currentNumberFrequency = freq.getOrDefault(num,0); // get current frequency

            if( nextNumberFrequency  > 0 ){ // num + 1 in map
             length = Integer.max( length , currentNumberFrequency + nextNumberFrequency );
            }

            if( prevNumberFrequency   > 0 ){ // num - 1 in map
            
             length = Integer.max( length , currentNumberFrequency + prevNumberFrequency );
            }

        }

        return length;
        
    }
}