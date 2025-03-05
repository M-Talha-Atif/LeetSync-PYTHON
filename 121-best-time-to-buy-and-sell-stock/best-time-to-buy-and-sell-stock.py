class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mini = prices[0]
        maxDiff = 0
        for i in range(1,len(prices)):
            maxDiff = max(prices[i]-mini,maxDiff)
            if prices[i] < mini:
                mini = prices[i]
                
        return maxDiff


