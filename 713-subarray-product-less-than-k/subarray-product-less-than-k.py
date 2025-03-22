class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        left = 0
        total = 0
        prod = 1
        for right in range(len(nums)):
            prod*= nums[right]
            while left<=right and prod>=k:
                  prod/=nums[left]
                  left+=1
            total += right-left+1

        return total
        