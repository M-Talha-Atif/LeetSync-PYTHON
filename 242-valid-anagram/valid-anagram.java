class Solution {
    public boolean isAnagram(String s, String t) {
        // sort both and check
        HashMap<Character, Integer> frequencyCounter = new HashMap<Character, Integer>();
        if ( s.length() != t.length() ) return false;
        // same length, same frequency
        for ( char c : s.toCharArray()) {
            frequencyCounter.put( c, frequencyCounter.getOrDefault(c,0) + 1);
        }
        for ( char c : t.toCharArray()) {
            frequencyCounter.put( c, frequencyCounter.getOrDefault(c,0) - 1);
        }
        for ( int frequency : frequencyCounter.values() ) {
             if ( frequency != 0) return false;
        }

        return true;

        
    }
}