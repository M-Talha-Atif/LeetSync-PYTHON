class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        # total sub arrays = n * (n+1) / 2
        # sub arrays with < k
        # others sub arrays with k>=
        n = len(nums)
        def myBad(nums,k):
            maxi = max(nums)
            left,res,currMaxi=0,0,0
            for right in range(len(nums)):
                if nums[right] == maxi:
                    currMaxi+=1
                while currMaxi>=k:
                      if nums[left]==maxi:
                         currMaxi-=1
                      left+=1
                res = res + (right - left+1)
            return res
        check = ( n *(n+1) // 2 )
        # print(check)
        return  check - myBad(nums,k)



        