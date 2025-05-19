class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // finding common prefix
        while (right > left) {
            right = right & (right - 1); // removes the rightmost set bit
        }
        return right;
        
    }
}