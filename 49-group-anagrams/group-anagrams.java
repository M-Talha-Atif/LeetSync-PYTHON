class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // each string we sort it and iterate over next strings and sort them and check if it 
        // matches then we put them in a SET
        // Big O of n log n * n
        Map<String, List<String>> storage = new HashMap<String, List<String>>();

        for ( String anagram : strs){
            // convert to char array
            char[] chars =  anagram.toCharArray();
            // sort the string
            Arrays.sort(chars);
            // convert back to string
            String groupedKey = new String(chars);


            List<String> anagrams = storage.getOrDefault(groupedKey, new ArrayList<>());
            anagrams.add(  anagram );
            storage.put(groupedKey, anagrams);
        }

        List<List<String>> result = new ArrayList<>();

        for ( List<String> list : storage.values() ) {
            result.add (list);
        }


        return result;


    }
}