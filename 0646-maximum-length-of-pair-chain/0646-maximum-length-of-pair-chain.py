class Solution:
    def findLongestChain(self, pairs: List[List[int]]) -> int:

        maxLen = 1
        pairs = sorted(pairs, key = lambda x : x[1])
        dp = {}
        for i in range( len(pairs) ):
            dp[i] = 1
            for j in range( 0, i ):
                if pairs[j][1] < pairs[i][0]:
                   dp[i] = max( dp[i],  dp[j] + 1)
                   maxLen = max(dp[i],maxLen)
        return maxLen

        