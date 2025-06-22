class Solution {
    public String[] divideString(String s, int k, char fill) {
        // k - k
        int n = s.length();
        int totalGroups = (n+k-1) / k;
        String[] res = new String[totalGroups];
        int index=0;

        for( int i=0; i < n; i+=k )
        {  
           StringBuilder toBeAdded = new StringBuilder();
           if (i+k<n)
           {
            toBeAdded.append( s.substring( i, i+k )  );

           }
           else {
             toBeAdded.append( s.substring( i, n )  );
             while ( toBeAdded.length()<k ){
             toBeAdded.append(fill);
                               }
           }
           
            res[index++] =  toBeAdded.toString()  ;
        }

   

        return res;
  
    }
}