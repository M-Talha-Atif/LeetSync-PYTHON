class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        countZeros = 0
        left = 0
        maxLength  = 0
        for right in range(len(nums)):
            countZeros += 1 - nums[right]
            while left<=right and  countZeros > k:
                  countZeros -= 1 - nums[left]
                  left+=1
            maxLength = max(maxLength, right - left + 1)
        return maxLength
            

        