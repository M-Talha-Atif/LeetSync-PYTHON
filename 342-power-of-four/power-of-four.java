class Solution {
    public boolean isPowerOfFour(int n) {
        // 0x55555555 is 0101 0101 ....
        return (n > 0) && ((n & (n - 1)) == 0) && ((n & 0x55555555) == n);
        
    }
}