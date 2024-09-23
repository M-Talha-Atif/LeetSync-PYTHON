class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        print(nums)
        data = []
        # to ensure that two elements left after first one
        for i in range( len(nums) - 2 ):
            left = i + 1
            right = len(nums) - 1
            if i>0 and nums[i] == nums[i-1]:
                continue
            while left < right:
                target = nums[i] + nums[left] + nums[right]
            
                if target>0:
                    right -= 1
                    
                elif target < 0 :
                    left += 1
                    
                else:
                    data.append(  [ nums[i],nums[left],nums[right] ]  )
                    left+=1
                    while ( nums[left] == nums[left-1]  and left<right):
                        left +=1
                    
        return data
            
        
                    
        