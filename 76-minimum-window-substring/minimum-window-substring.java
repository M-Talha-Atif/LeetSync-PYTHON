class Solution {
    public String minWindow(String s, String t) {

        // mistakes new keyword forgetting
        // brackets mistake
        // string has charAt, don't use index 
        // convert string to toCharArray for for each loop

        // counting frequency of t string
        // decrement the frequency and if counter becomes 0 enter in while body
        // increment the frequncy by one, if frequency already greater than 0 then
        // it is t character so counter will increase by 1 and loop will break


        int left = 0;
        int minLength = Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       
        // Map to hold values
        for(Character s1 : t.toCharArray()){
            map.put( s1, map.getOrDefault(s1,0) + 1);
        }

        int n = s.length();

        int counter = t.length();

        int myStart = -1;

        for ( int right =0; right < n; right++ ) {

            
            if (  map.getOrDefault ( s.charAt(right) ,0)   >0 ) {
                    // incremented as it belongs to t string
                    counter-=1;
                }
            
            // decrement by 1
            map.put( s.charAt(right), map.getOrDefault(s.charAt(right),0) - 1);


            while( counter == 0){

                int curr  = right - left + 1;

                if ( curr < minLength ){

                    minLength = curr;
                    myStart = left;

                }

                map.put( s.charAt(left), map.getOrDefault(s.charAt(left),0) + 1); // increment by 1

                if (  map.getOrDefault ( s.charAt(left) ,0)   >0 )  {
                    // incremented as it belongs to t string
                    counter+=1;
                }

                left+=1;


            }


        }

  

        return  minLength == Integer.MAX_VALUE ? "" : s.substring(myStart, myStart +  minLength);




        
    }
}