class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;


        String result = "";

        while( i>=0 || j>=0 || carry == 1) {
            if (i>=0){
                carry += a.charAt(i--) - '0';
            }
            if (j>=0){
                carry += b.charAt(j--) - '0';
            }
            String res = String.valueOf(carry % 2 );

            result = res + result;

            carry/=2;

        }

        return result;
        
    }
}