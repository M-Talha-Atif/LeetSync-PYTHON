class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        data = set()
        res = []
        n  = len(grid)
        # time complexity big o (n^2)
        for outside in range(n):
            for inside in range(n):
                element = grid[outside][inside]
                if  element in data:
                    res.append(element)
                data.add(element)
        # time complexity big o (n)
        for i in range(1, (n*n) +1):
            if i not in data:
              res.append(i)
        return res
              
               
               
        