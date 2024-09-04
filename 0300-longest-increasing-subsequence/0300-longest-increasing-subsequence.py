class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        def giveIt(data,index , previous , dp):
            if index>= len(data):
                return 0
            if (index, previous) in dp:
                return dp[(index, previous)]
            take = 0
            if previous==-1 or data[previous] < data[index]:
                  take = 1 + giveIt(data, index+1, index,dp )
            skip = giveIt(data, index+1, previous,dp )

            dp[(index,previous) ] = max(take,skip)

            return dp[(index,previous)]
        dp = {}
        return giveIt(nums,0,-1,dp)
                
                  
        