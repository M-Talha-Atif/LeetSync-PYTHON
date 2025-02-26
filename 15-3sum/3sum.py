class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # target = 0
        nums.sort()
        data =[]
        n =  len(nums)
        for i in range( 0, n ):
            if i>0 and nums[i-1]==nums[i]:
               continue
            j,k = i+1, n-1
            while j < k:
                  total = nums[j]+nums[k] 
                  if total==-nums[i]:
                    data.append([nums[i],nums[j],nums[k]])
                    j += 1
                    while nums[j] == nums[j-1] and j < k:
                        j += 1
                        
                  elif total>-nums[i]:
                       k-=1
                  else:
                       j+=1
        return data

               
        