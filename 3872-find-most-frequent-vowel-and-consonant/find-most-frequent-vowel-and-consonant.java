class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];

        s.chars().forEach(  c -> freq[c - 'a'] += 1 );

        int maxVowel = 0;
        int maxConsonants = 0;

        for (int i = 0; i < freq.length; i++) {

            if ( i==0 || i==4 || i==8 || i==14 || i==20){
                maxVowel = Math.max(freq[i],maxVowel);
            }
            else {
                maxConsonants  = Math.max(freq[i],maxConsonants );
            }
           
        }

        return maxConsonants  +  maxVowel;

        


        
    }


   boolean checkVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

}