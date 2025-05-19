class Solution {
    public int getSum(int a, int b) {

     int carry;
     // left shift the carry by 1 so that 1 comes at actual position

     while (b!=0) {
        carry = ( a & b ); 
        a = a ^ b;
        b = (carry)<<1;
       
     }

     return a;
        
    }
}