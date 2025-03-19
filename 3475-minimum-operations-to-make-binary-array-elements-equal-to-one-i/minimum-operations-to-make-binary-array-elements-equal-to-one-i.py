class Solution:
    def minOperations(self, nums: List[int]) -> int:
        def changeElement(element):
            return element+1 if element==0 else 0
        count = 0
        total = 0
        
        for right in range(len(nums)-2):
            if nums[right]==0:
                nums[right] = 1
                nums[right+1],nums[right+2]= changeElement(nums[right+1]), changeElement(nums[right+2])
                count+=1
            total+=nums[right]
        total += nums[-1]
        total += nums[-2]
        # print(nums)
        return count if total==len(nums) else -1

        

        