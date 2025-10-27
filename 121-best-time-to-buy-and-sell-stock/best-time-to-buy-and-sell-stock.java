class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int ans = 0;
        for ( int i=1; i<prices.length; i++){
            ans = Math.max(ans, prices[i] - minimum);
            minimum = Math.min(minimum, prices[i]);
        }

        return ans;
        
    }
}