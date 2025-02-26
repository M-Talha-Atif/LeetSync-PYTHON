class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        data = defaultdict(int)

        for index,element in enumerate(numbers):
            check = target - element
            if  check in data:
                index1 = data[target - element]
                return [index1+1,index+1]
            data[element] = index
        return []
        