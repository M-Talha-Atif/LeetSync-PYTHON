class Solution {
    public int maxProfit(int[] prices) {

        int left = 0;
        int n = prices.length;
        int right = n -1;
        Integer minLeft = prices[0];

        int profit = 0;

        for(left=1; left<n; left++){

            if(prices[left] < minLeft){
                minLeft = prices[left];
            }
            else {
                profit = Math.max(prices[left]-minLeft, profit);
            }
           
        }

        return profit;
        
    }
}