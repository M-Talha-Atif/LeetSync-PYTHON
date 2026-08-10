class Solution {
    public int maxProfit(int[] prices) {

        int buyDay = prices[0];   
        int maximumProfit = 0;      

        int n = prices.length - 1;
        for(int i = 1; i <=n ; i++ ) {
            int currentProfit = prices[i] - buyDay;
            maximumProfit = Math.max( currentProfit, maximumProfit);
            buyDay = Math.min( buyDay, prices[i]);


        }

        return maximumProfit;
    }
}