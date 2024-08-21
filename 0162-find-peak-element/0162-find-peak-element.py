class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        if len(nums) == 2 and nums[0] > nums[1] :
           return 0
        if len(nums) == 2 and nums[1] > nums[0]:
            return 1
        for i in range(1, len(nums) - 1):
            if nums[i]>nums[i-1] and nums[i]>nums[i+1]:
                return i
        return 0
        