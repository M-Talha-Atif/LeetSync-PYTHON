class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        data1, data2 = defaultdict(int),defaultdict(int)
        mango = []
        count = 0
        for i in range(len(A)):
            data1[A[i]]+= 1
            data2[B[i]]+= 1
            if A[i]==B[i] and A[i] in data2 and B[i] in data1:
                count+=1
            else:
             if A[i] in data2:
               count+=1
             if B[i] in data1:
               count+=1
            mango.append(count)
            
        return mango
               
               
        