class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        size = len(nums)
        if size == 1:
            return 0

        if size>=2 and nums[0]>nums[1]:
            return 0

        if nums[size - 1] > nums[size -2]:
           return size - 1
        left = 1
        right = size - 2
        while left <= right:
              mid =  ( left + right ) // 2
              if nums[mid]>nums[mid-1] and nums[mid]>nums[mid+1]:
                return mid
              elif nums[mid] < nums[mid-1]:
                    right = mid - 1  
              elif nums[mid] < nums[mid+1]:
                    left = mid + 1
                     
        return -1
        