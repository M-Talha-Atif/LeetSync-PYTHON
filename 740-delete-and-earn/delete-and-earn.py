class Solution:
    def deleteAndEarn(self, nums: List[int]) -> int:
        n = len(nums)
        nums = sorted(nums)

        def solve(array,i,dp={}):
            if i>=n:
               return 0
            if i not in dp:
               currSum = array[i]
               taken = array[i]
               index = i+1
               while index<n and array[index]==currSum:
                    taken+=array[i]
                    index+=1

              # skip the +1 numbers
               while index<n and array[index]==currSum+1:
                     index+=1

               dp[i] = max(taken+solve(array,index), solve(array,i+1) )
            return dp[i]

        return solve(nums,0)
             
              
               
        


# 4,2

# 4,3,2

# 4,3,3,3,2,2
# 3,3