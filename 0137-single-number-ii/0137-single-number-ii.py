class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums = sorted(nums)
        print(nums)
        for i in range(0,len(nums),3): # 2,2,2,3,4,4,4
            
            if i+1<len(nums) and i+2<len(nums) and ( nums[i+1]!= nums[i] and nums[i]!=nums[i+2]):
               return nums[i]
        if nums[-1] != nums[-2]:
           return nums[-1]
        return -1
        