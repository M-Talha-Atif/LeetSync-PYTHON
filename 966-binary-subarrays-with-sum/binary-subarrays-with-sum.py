class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
     def myBad(nums, goal):
            
        currSum = 0
        left=0
        res = 0
        for right in range(len(nums)):
            currSum+= nums[right]
            while currSum>goal and left<=right:
                 currSum-= nums[left]
                 left+=1
            res = res + (right - left+ 1 )
        return res
        # first function -> <= and second function <
     return myBad(nums,goal) - myBad(nums,goal-1)
            