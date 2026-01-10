class Solution {
    public boolean isAnagram(String s, String t) {

        // anagram, nagaram
        // math
        // 1 map for incrementing frequency
        // 1 map for decrementing frequency
        // space complexity big o of n
        // time complexity big of n

         HashMap<Character,Integer> counter = new HashMap<>();

        // count frequencies for  s string increment
        for( char character : s.toCharArray() ) {
            counter.put(character, counter.getOrDefault(character,0) + 1);
        }
        // decrement the same characters of both strings
        for( char character : t.toCharArray() ) {
            counter.put(character, counter.getOrDefault(character,0) - 1);
        }
        
        // result should be zero if both count same
        for( int freq : counter.values() ){
            if (freq!=0) {return false;}
        }

        return true;
        
    }
}