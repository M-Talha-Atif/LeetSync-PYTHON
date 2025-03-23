class Solution:
    def subarraysWithKDistinct(self, nums: List[int], k: int) -> int:
        def countElements(nums,k):
            left = 0
            data = defaultdict(int)
            count = 0
            for right in range(len(nums)):
                data[nums[right]]+=1
                while len(data)>k:
                      data[nums[left]]-=1
                      if data[nums[left]] == 0:
                         del data[nums[left]]
                      left+=1
                count += right - left + 1
            return count
        return countElements(nums,k) - countElements(nums,k-1)

        