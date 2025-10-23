class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder data = new StringBuilder(s);
        while ( data.length() > 2){
            StringBuilder newString = new StringBuilder();

            for (int i=0; i<data.length()-1 ; i+=1){
                int a1 = data.charAt(i)-'0';
                int a2 = data.charAt(i+1)-'0';
                newString.append((char) ('0'+ (a1+a2) %10));
            }
            data = newString;


        }

        return data.charAt(0)==data.charAt(1);
        
    }
}