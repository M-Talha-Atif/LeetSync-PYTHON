class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a = defaultdict(int)
        data = []
        for index, i in enumerate(nums):
            d = target - i
            if  d in a:
               data.append(index)
               data.append(a[d])
               return data
            a[i]=index
        return data
               
        