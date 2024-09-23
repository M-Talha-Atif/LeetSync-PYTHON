class Solution:
  def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
    nums.sort()
    data = []
    # to ensure that three elements left after first one
    for i in range( len(nums) - 3 ):
        if i>0 and nums[i] == nums[i-1]:
            continue
        # to ensure that two elements left after second one
        for j in range( i+1, len(nums) - 2 ):
            

            if j> i+1 and nums[j] == nums[j-1]:
                continue
            left = j + 1
            right = len(nums) - 1

            while left < right:

                # as we need close sum so
                # let say current sum is 3 then minus it with target
                # take one that is most close (means minimum)

                total = nums[i] + nums[j] + nums[left] + nums[right]
            
                if total == target:
                  
                   data.append( [nums[i],nums[j],nums[left], nums[right]] )
                   left+=1
                   right-=1
                   while left < right and nums[left] == nums[left-1]:
                      left +=1
                   while left < right and nums[right] == nums[right+1]:
                      right -=1
                    
                elif total < target:
                    left +=1
                else:
                    right -= 1
                    
    return data
        