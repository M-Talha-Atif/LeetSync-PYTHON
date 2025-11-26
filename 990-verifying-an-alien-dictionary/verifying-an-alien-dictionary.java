class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // two word pairs comparison on the basis of order
        int[] rank = new int[26];
        for ( int i=0; i<order.length(); i++){
            char c = order.charAt(i);
            rank[ c -'a' ] = i; // assign the order from index
        }  
         for ( int i=1; i < words.length; i++){
            if (! isSorted( words[i-1], words[i], rank )){
                return false;
            }
        }  
        return true; 
        
    }
    public boolean isSorted(String word1, String word2, int[] rank){
        int minLength = Math.min(word1.length(), word2.length()); // minimum length for comparison
        for (int i=0; i<minLength; i++){
            char c1 = word1.charAt(i),c2 = word2.charAt(i);
            if ( c1 != c2 ){
                // first unmatched character rank to determine sorted or not
                return rank[c1-'a'] < rank[c2-'a'];
            }
        }

        return word1.length() <= word2.length();

    }
}