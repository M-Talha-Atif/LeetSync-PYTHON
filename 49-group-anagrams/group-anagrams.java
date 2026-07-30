class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // each string we sort it and iterate over next strings and sort them and check if it 
        // matches then we put them in a SET
        // Big O of n log n * n
        Map<String, List<String>> storage = new HashMap<String, List<String>>();

        // e a t - 1 1 1
       //  t e a - 1 1 1
       //  g h i - 1 1 1

        for ( String anagram : strs){
            // convert to char array
            int[] frequencyCounter = new int[26];
            for ( char c : anagram.toCharArray() ) {
                frequencyCounter[c - 'a']++;
            }
            StringBuilder canonicalKey = new StringBuilder();

            for ( int count : frequencyCounter ) {
                canonicalKey.append("#").append(count);
            }

            List<String> anagrams = storage.getOrDefault(canonicalKey.toString(), new ArrayList<>());
            anagrams.add(  anagram );
            storage.put( canonicalKey.toString() , anagrams);
        }


        return new ArrayList<>( storage.values() );


    }
}