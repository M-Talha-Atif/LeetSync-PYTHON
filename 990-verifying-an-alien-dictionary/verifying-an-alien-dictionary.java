class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // order rank
        // sorted check we do pair matching so thing is we need to check only two words at a time
        int[] rank = new int[26];
        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }
        for ( int j=1; j < words.length;  j++){
             if ( ! isSorted( words[j-1], words[j], rank) ){
                  return false;
             }
        }

        return true;
        // words matching logic
        // two chracters are equal, then check their rank  
    }
    public boolean isSorted( String w1, String w2, int[] rank)
    { 
        int length = Math.min( w1.length(), w2.length() );
        for ( int i=0; i<length; i++){
            char a = w1.charAt(i);
            char b = w2.charAt(i);
            if ( a != b){
                int rank1 = rank[ a - 'a'];
                int rank2 = rank[ b - 'a'];
                return rank1 < rank2;
            }
        }

        return w1.length() <= w2.length();


    }
}