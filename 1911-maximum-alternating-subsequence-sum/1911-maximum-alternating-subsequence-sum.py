class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        def giveIt(nums,index,flag,dp = {}):
         if index>= len(nums):
               return 0
         if (index, flag) not in dp:
            skip = giveIt( nums,index+1,flag)
            value = nums[index]
            if not flag:
                value = -value
            take = value + giveIt(nums, index+1, not flag)
            dp[(index, flag)] =  max(skip,take)
         print(dp)
    
         return dp[(index, flag)]

        return giveIt(nums,0,True)
            