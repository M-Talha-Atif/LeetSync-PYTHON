class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        # make k=goal
        for index in range(len(nums)):
            # even -> 0, odd -> 1
            nums[index] = nums[index] & 1
        def myBad(nums,goal):
            left,currSum,res=0,0,0
            for right in range(len(nums)):
                currSum+= nums[right]
                while currSum>goal:
                      currSum-=nums[left]
                      left+=1
                # satisfy if then count the substrings
                res+= (right-left+1)
            return res
        return myBad(nums,k) - myBad(nums,k-1)
        