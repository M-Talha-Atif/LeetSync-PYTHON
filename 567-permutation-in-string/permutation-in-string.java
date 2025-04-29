class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // s1 length fixed
        if (s1.length() > s2.length()){
                return false;
        }
         
        Map<Character,Integer> s1Freq = new HashMap<>();
        Map<Character,Integer> s2Freq = new HashMap<>();

        for (int i=0; i  <  s1.length(); i++){

            s1Freq.put(s1.charAt(i), s1Freq.getOrDefault( s1.charAt(i) ,0)  +  1);
            s2Freq.put(s2.charAt(i), s2Freq.getOrDefault( s2.charAt(i), 0)  +  1);
        }

        // System.out.println(s2Freq);

        if (s1Freq.equals(s2Freq)){
            return true;
        }

        int left = 0;
        
        // done till s1.length
        for (int right= s1.length(); right<s2.length(); right++){
            // Increase window, add new character
            char rightChar = s2.charAt(right);

            s2Freq.put(rightChar, s2Freq.getOrDefault(rightChar,0)  + 1  );


            // Shrink Window, remove old character
            char leftChar = s2.charAt(left);

            s2Freq.put(leftChar, s2Freq.get(leftChar)  -  1);

            if (  s2Freq.get(leftChar)==0  ){
                s2Freq.remove(leftChar);
            }
            left++; // keep window according to s1 size


            // check 
            if (s1Freq.equals(s2Freq)){
                return true;
            }
          
        }

        return false;
        
    }
}