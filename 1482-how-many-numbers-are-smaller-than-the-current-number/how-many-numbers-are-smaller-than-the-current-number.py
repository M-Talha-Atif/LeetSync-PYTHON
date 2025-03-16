class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        new = []
        data = nums
        for i in range(len(data)):
            count = 0
            for j in range(len(data)):
                if i!=j and data[j] < data[i]:
                    count+=1
            new.append(count)
        return new
        