class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        def giveIt(array,index,amount,dp={}):
            if amount==0:
              return 1
            if index>= len(array):
               return 0
            
            if (index,amount) not in dp:
             if coins[index] > amount:
                dp[(index,amount)] = 0 + giveIt(array,index+1,amount)
             else:
                take = giveIt(array,index,amount-array[index])
                notTake = giveIt(array,index+1,amount)
                dp[(index,amount)] = take + notTake
            return dp[(index,amount)]
        return giveIt(coins,0,amount)
        