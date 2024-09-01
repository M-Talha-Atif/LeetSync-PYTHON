class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:

        data = []
        i = 0
        elementsCovered = 0
        for row in range(m):
            man = original[i: i+n ]
            elementsCovered += len(man )
            if man == []:
                return []
            data.append (man )
            i+=n # increment i
        if elementsCovered != len(original):
            return []
        if elementsCovered == 1 and  (n >=2 or m>=2):
            return []
        return data
        