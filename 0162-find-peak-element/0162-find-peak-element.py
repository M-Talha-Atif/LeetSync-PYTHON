class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        size = len(nums)
        if size>=2 and nums[0]>nums[1]:
            return 0

        if nums[size - 1] > nums[size -2]:
           return size - 1
        for i in range(1, size - 1):
            
            if nums[i]>nums[i-1] and nums[i]>nums[i+1]:
                return i
        return 0
        