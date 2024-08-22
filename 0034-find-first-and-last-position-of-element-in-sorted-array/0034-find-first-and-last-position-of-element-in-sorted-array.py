class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        start = -1
        end = -1
        size = len(nums) 
        left = 0
        right = size - 1
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] == target:
                start = mid
                # search in left part 
                right = mid - 1
                left = 0
                # goingBack = mid
                # goingForward = mid
                
                # while goingBack - 1 >=0 and nums[goingBack-1] == target:
                #     start = goingBack - 1
                #     goingBack -= 1
                # while  goingForward+1<len(nums) and nums[goingForward+1] == target:
                #     end = goingForward + 1
                #     goingForward += 1
                # break
            elif nums[mid] < target: 
                left = mid + 1 # right sub array     
            else:
                right = mid - 1 # left sub array
        left = 0 
        right = size - 1

        while left <= right:
            mid = (left + right) // 2
            if nums[mid] == target:
                end = mid
                # search in right part 
                right = size - 1
                left = mid + 1
              
            elif nums[mid] < target: 
                left = mid + 1 # right sub array     
            else:
                right = mid - 1 # left sub array
                
        return [start,end]
                
                 
                 