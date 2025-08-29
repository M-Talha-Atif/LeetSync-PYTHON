class Solution {
    public boolean isAlienSorted(String[] W, String O) {
        // store index of characters as values with keys as characters
        // fetch each character of word 1 and word 2 compare them
        // do it for all pair of pair of words
        Map<Character,Integer> order = new HashMap<>();
        for (int i = 0; i < O.length(); i++)
            order.put(O.charAt(i), i);
        for (int i = 1; i < W.length; i++) {
            String a = W[i-1];
            String b = W[i];
            for (int j = 0; j < a.length(); j++) {
                if (j == b.length()){
                    return false;
                }
                char cha = a.charAt(j);
                char chb = b.charAt(j);
                if (order.get(cha) < order.get(chb)){
                    break;
                }
                if (order.get(cha) > order.get(chb)){
                    return false;
                }
            }
        }
        return true;
    }
}