class Solution {
    public String removeOuterParentheses(String s) {
        // ( , balance = 1
        // (,  balance = 2
        int balance = 0;
        StringBuilder result = new StringBuilder(); 
        for ( int i=0; i < s.length() - 1 ; i++){
            if ( s.charAt(i) == '(') {
                // if balance is greater than zero than add it
                if ( balance > 0) {
                   result.append(s.charAt(i));
                }
                balance+=1;
            }
            else {
                balance-=1;
                // if balance is greater than zero than add it
                if ( balance > 0) {
                   result.append(s.charAt(i));
                }
        
            }
        }

        return result.toString();
        
    }
}