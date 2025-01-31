class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        data = defaultdict(int)
        total = []
        for ele in nums:
            data[ele]+=1
        maxF = max(list(data.values()))
        # print(maxF)
        for i in range(maxF):
            temp = []
            for key,value in data.items():
                if value>0:
                   temp.append(key)
                   data[key]-=1
            total.append(temp)   
               
        return total
        