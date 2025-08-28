class Solution {
    public String mergeAlternately(String word1, String word2) {
        // two pointers, comparison of characters

        String newWord = "";
        int n1= word1.length();
        int n2= word2.length();
        int i=0, j=0;

        while (  i < n1 && j < n2 )
            
        {   char a = word1.charAt(i);
            char b = word2.charAt(j);
            newWord += a;
            i+=1;
            newWord += b;
            j+=1;
    
        }

        while (  i < n1 )
        {   char a = word1.charAt(i);
            newWord += a;
            i+=1;
        }
         while (  j < n2 )
        {   char b = word2.charAt(j);
            newWord += b;
            j+=1;
        }


        return newWord;
        
    }
}