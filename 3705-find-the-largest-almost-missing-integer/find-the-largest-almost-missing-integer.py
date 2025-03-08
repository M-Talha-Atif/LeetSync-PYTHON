class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        if k == len(nums):
           return max(nums)
        freq=defaultdict(int)
        for i in range(len(nums)-k+1):
            # freq[nums[i]]+=1
            for j in range(i,i+k):
                freq[nums[j]]+=1
        
        maxi = float("-inf")
        for key,value in freq.items():
            if value==1:
               maxi = max(maxi,key)
        return -1 if maxi == float("-inf") else maxi
        