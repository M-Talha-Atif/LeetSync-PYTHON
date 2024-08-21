class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map1 = {}
        # a+b= target .. target-b = a
        for i in range( len(nums) ):
            complement = target - nums[i]   
            if complement in map1:
                return [ map1[complement], i ]
            map1[  nums[i] ] = i
        return []
             