class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        HashSet<Character> data = new HashSet<Character> ();

        int longest = 0;
        
        for(int right = 0; right < s.length(); right+=1)
        {  
            // check if duplicate  

            while( data.contains( s.charAt(right) )   )
             
             { 
                // remove element from set
                data.remove(s.charAt(left));
                left+=1;
            }
        // add the element in set

            data.add(s.charAt(right));

            longest = Math.max(longest, right - left + 1);



        }

        return longest;


        
    }
}