class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix) # total rows
        cols = len(matrix[0]) # total columns
        print(f'{rows} {cols}')
        
        for row in range( rows ): # giving m 
            left = 0
            right = cols - 1
            while left <= right:
              mid = (left+right)//2
              if matrix[row][mid] == target:
                return True
              elif matrix[row][mid] > target:
                   right-=1
              else:
                   left+=1
        return False
        