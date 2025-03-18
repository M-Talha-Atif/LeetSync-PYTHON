class Solution:
    def longestNiceSubarray(self, nums: List[int]) -> int:
        longest = 1
        mask = nums[0]
        left = 0
    
        for right in range(1, len(nums)):
           
            while mask & nums[right]!= 0 and left < len(nums):
                  mask = mask ^ nums[left]
                  left+=1
            mask = mask | nums[right]
            longest = max(longest, right-left+1)
        return longest
        
        