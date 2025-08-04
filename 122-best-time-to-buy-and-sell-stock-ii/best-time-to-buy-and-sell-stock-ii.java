class Solution {
    // 1,5
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i =1; i< prices.length; i++){
            int profit = prices[i] - prices[i-1];
            if (profit > 0){
                maxProfit += profit;
            }
        }

        return maxProfit;
        
    }
}