public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        // to drop least significant bit we right shift by 1 >>
        // left shift would add a zero <<
        if (n == 0) return 0;

        int result = 0;

        for ( int i=0; i<32; i++ ){
            result <<= 1; // left shift by 1 to add zero
            result += n&1;
            n >>= 1; // right shift by 1 to remove LSB (least significant bit)
        }

        return result;
        
    }
}