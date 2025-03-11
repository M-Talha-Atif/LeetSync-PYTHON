class Solution:
    def countCompleteSubarrays(self, nums: List[int]) -> int:
        data = set()
        for n in nums:
            data.add(n)
        def myBad(nums,goal):
            left,currSum,res=0,Counter(),0
            for right in range(len(nums)):
                currSum[nums[right]]+=1
                while len(currSum)>goal and left<=right:
                      currSum[nums[left]]-=1
                      if currSum[nums[left]]==0:
                         del currSum[nums[left]]
                      left+=1
                res+= (right-left+1)
            return res

        # print(myBad(nums,len(data)+1))
        # print(myBad(nums,len(data)-1))
        return myBad(nums,len(data)) - myBad(nums,len(data)-1)
        