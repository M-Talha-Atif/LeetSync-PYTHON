class Solution {
    public int reverse(int x) {
         long res = 0;
        while (x != 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
        }
        return (int)res == res ? (int)res : 0;
        
    }
}