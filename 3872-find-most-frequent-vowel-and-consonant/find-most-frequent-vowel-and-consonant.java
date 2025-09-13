class Solution {
    public int maxFreqSum(String s) {
        int[] freq= new int[27];
        int maxiVowel = 0;
        int maxiConsonant = 0;
        for ( char c: s.toCharArray() ){
            freq[ (int)c - 97] +=1 ;
            if ( isVowel(c) ){
                maxiVowel = Math.max( freq[(int)c - 97], maxiVowel );
            }
            else {
                maxiConsonant = Math.max( freq[(int)c - 97], maxiConsonant );
            }
        }
        return maxiVowel + maxiConsonant;
        
    }

    boolean isVowel(char check){
        return check=='a' || check=='e' || check=='i' || check=='o' || check=='u';
    }
}