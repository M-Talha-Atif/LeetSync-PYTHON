class Solution {
    public String largestGoodInteger(String num) {
        
        int count = 0;
        int maximum = -1;
        int index = -1;
        for (int i=2; i< num.length(); i++){
            char first =  num.charAt(i-1);
            char second = num.charAt(i-2);
            char current = num.charAt(i);

            
            
            if ( first == second && first == current){
                 
                int digit = num.charAt(i) - '0';
                // System.out.println( digit );
                if ( digit > maximum ){
                    maximum = digit;
                    index = i;
                }
                if ( maximum == 9){
                    index = i;
                    break; // can't find larger than this
                }
            }
        }

        System.out.println( index );
         if (index >= 0) {
            return String.valueOf(num.charAt(index)).repeat(3);
        }
            

        return "";
        
    }
}