class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        piles = sorted(piles,reverse=True)
        x =  len(piles)
        if x == 3:
           return piles[1]
        total = 0
        i = 1
        m = x // 3
        for k in range(m):
            total += piles[i]
            i+=2

        # 19,15,14,12,11,10,8,7,6,5,4,2
        # 15,12,10,7,2
        # 8,7,4,2,2,1

        # 19,15,2
        # 14,12,4
        # 11,10,5
        # 8,7,6
        return total
        