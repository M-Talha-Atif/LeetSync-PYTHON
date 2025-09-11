class Solution {
    public String sortVowels(String s) {
        TreeMap<Character, Integer> freqMap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (isVowel(curr)) // Basically count freq of each vowel letter
                freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (isVowel(curr)) {
                char lowest = freqMap.firstKey(); // TreeMap does automatically sort the entry map with the key (vowel in this case) for us
                int freq = freqMap.getOrDefault(lowest, 0);
                if (freq > 0) {
                    sb.append(lowest); // append the smallest vowel letter 
                    freqMap.put(lowest, freq - 1); // decrement the freq
                }
                if ( freq - 1  <= 0) // If the freq is less than or equal to 0, then we remove this entry entirely
                    freqMap.remove(lowest);
            } else { // Otherwise, we just append whatever consonants to the output string
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    // Helper method to check whether this is a vowel character
    boolean isVowel(char curr) {
        curr = Character.toLowerCase(curr);
        return curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u';
    }
}