class Solution {
    public String mergeAlternately(String word1, String word2) {

        // first character of word1, then word 2
        int minLength = Math.min(word1.length(), word2.length());

        String result = "";

        int i = 0;

        for ( i=0; i<minLength; i++){
            result+= word1.charAt(i);
            result+= word2.charAt(i);
        }

        // remaining characters for either word1 or word2

        while ( i < word1.length() ) {
            result+= word1.charAt(i);
            i++;
        }

        while ( i < word2.length() ) {
            result+= word2.charAt(i);
            i++;
        }


        return result;



        
    }
}