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
            if ( !frequencyCounter.containsKey(c) ) return false;

            frequencyCounter.put( c, frequencyCounter.getOrDefault(c,0) - 1);
            
            if ( frequencyCounter.get(c) == 0) { frequencyCounter.remove(c); }
        }

        return frequencyCounter.isEmpty();

        
    }
}