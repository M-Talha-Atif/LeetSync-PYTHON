class Solution:
    def findDuplicate(self, nums: List[int]) -> int:

        for i in range( len(nums)):
            if nums[i] in nums[ i+1:]:
               return nums[i]
        retun -1
        