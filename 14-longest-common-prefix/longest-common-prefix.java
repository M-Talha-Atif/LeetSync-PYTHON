class Solution {
    public String longestCommonPrefix(String[] strs) {
        // minum length so alwasy keep maximum in length
        // avoid same indexing variable name in nested loops
        // use charAt for string
        // use math
        // edge case -> empty strings array
        // edge case -> 1 string in whole array
        // edge case -> break the inner loop if first unmatch comparison in inner loop


        // sab se smallest ko compare krlu longest se
        // flow, flower
        // smallest flo, flr
        // horizontal matching, pick up first string compare it with rest
        int startLength = 201;
        String firstString = strs[0];
        int n = strs.length;
        if ( n == 1){
            return  firstString;
        }
        // big of n
        // big of min( len(f), len(k) ) -> big of k
        // Big of O (n * k)

        for (int index=1; index<n; index++){
            String otherString = strs[index];
            int length = Math.min( firstString.length(), otherString.length() );
            int count = 0;
            for (int i=0; i<length; i+=1 ){
                if ( otherString.charAt(i) == firstString.charAt(i) )
                {
                    count+=1;

                } 
                else {
                    break;
                }
            }
            startLength = Math.min(startLength,count);
        }
        System.out.println(startLength );

        if ( startLength == 201){
            startLength -= 201;
        }

        return firstString.substring( 0, startLength);
        
        
    }
}