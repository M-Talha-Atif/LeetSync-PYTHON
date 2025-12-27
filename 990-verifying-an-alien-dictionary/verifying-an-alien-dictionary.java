class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = order.length();
        int rank[] = new int[n];
        for (int index=0; index<n; index++){
            char c  = order.charAt(index);
            int asciiValue = c - 'a';
            rank[ asciiValue ] = index; // assign the index for tracking the rank 
        }
        for (int i=1; i<words.length; i++){
            String word1 = words[i-1];
            String word2 = words[i];
            if ( !areWordSorted( word1, word2, rank ) ){
                return false;
            }
        }

        return true;   
        
    }

    private boolean areWordSorted( String word1, String word2 , int[] rank){
       

        int minLength = Math.min( word1.length(), word2.length() );

        for ( int i=0; i < minLength; i++){
            char c1 = word1.charAt( i );
            char c2 = word2.charAt( i );
            if (c1 != c2 ){
                // first mis-matching rank
                return rank[c1 -'a'] < rank[c2 -'a'];
            }
        }
        if ( word1.length() > word2.length()) return false;

        return true;


    } 
}