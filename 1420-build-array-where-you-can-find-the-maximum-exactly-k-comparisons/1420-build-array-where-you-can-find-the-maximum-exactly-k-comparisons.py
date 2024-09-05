class Solution:
    def numOfArrays(self, n: int, m: int, k: int) -> int:
        def giveIt(index,searchCost,maxSoFar,dp={}):
            if index == n:
               if searchCost==k:
                   return 1
               return 0 #not found
            
            if (index,searchCost,maxSoFar) not in dp:
                res = 0
                for i in range(1,m+1): # 1<=m
                   
                   if i>maxSoFar:
                      res+= giveIt(index+1, searchCost+1, i) % (10**9 + 7)
                   else:
                      res+= giveIt(index+1,searchCost,maxSoFar) % (10**9 + 7)
                dp[(index,searchCost,maxSoFar)] = res 
            return   dp[(index,searchCost,maxSoFar)] % (10**9 + 7)
        return giveIt(0,0,0) % (10**9 + 7)
                      
                     
        