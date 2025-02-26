class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        data = defaultdict(int)
        left,right = 0 , len(numbers)-1
        while left<right:
              total = numbers[left] + numbers[right]
              if total<target:
                 left+=1
              elif target<total:
                 right-=1
              else:
                return [left+1,right+1]
        
        return []
        