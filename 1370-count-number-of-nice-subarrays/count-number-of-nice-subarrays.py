class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        # make k=goal
        for index in range(len(nums)):
            # even -> 0, odd -> 1
            nums[index] = nums[index] & 1
        def myBad(nums,goal):
            left,currSum,res=0,0,0
            for right in range(len(nums)):
                currSum+= nums[right]
                while currSum>goal:
                      currSum-=nums[left]
                      left+=1
                # satisfy if then count the substrings
                res+= (right-left+1)
            return res
        return myBad(nums,k) - myBad(nums,k-1)
        
    # 1 1 0 1 1, k = 3
    # 1, res =1
    # 1 1, res = 1 + 2 = 3
    # 1 1 0, res = 3 + 3 = 6
    # 1 1 0 1, res = 6 + 4 = 10
    # 1 1 0 1 1, res = 10 + 4 = 14

    # 1 1 0 1 1, k = 2
    # 1, res =1
    # 1 1, res = 1 + 2 = 3
    # 1 1 0, res = 3 + 3 = 6
    # 1 1 0 1, res = 6 + 3 = 9
    # 1 1 0 1 1, res = 9 + 3 = 12

    # 14 - 12 == 2

