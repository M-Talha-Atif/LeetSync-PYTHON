class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        print(nums)
        data = []
        close_sum = float('inf')

        # to ensure that two elements left after first one
        for i in range( len(nums) - 2 ):
            left = i + 1
            right = len(nums) - 1
            if i>0 and nums[i] == nums[i-1]:
                continue
            while left < right:

                # as we need close sum so
                # let say current sum is 3 then minus it with target
                # take one that is most close (means minimum)

                total = nums[i] + nums[left] + nums[right]
            
                if (  abs(  target - total  ) < abs( target - close_sum )):
                   close_sum = total 
                    
                if total < target:
                    left +=1
                elif total == target:
                    return total
                else:
                    right -= 1
                    
        return close_sum
        