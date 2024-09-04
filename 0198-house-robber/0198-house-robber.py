class Solution:
    def rob(self, nums: List[int]) -> int:
        def give(nums,i,dp={}):
            if i>= len(nums):
               return 0 # all elements done
            if i not in dp:
               pick = nums[i] + give(nums,i+2) # skip adjacent element
               skip = give(nums,i+1) # going for adjacent element
               dp[i] = max(skip,pick)
            return dp[i]
        return give(nums,0)
        