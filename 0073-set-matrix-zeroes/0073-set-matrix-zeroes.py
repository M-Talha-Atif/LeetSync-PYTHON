class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        rows = len(matrix)
        cols = len(matrix[0])
        def makeRowZero(row,matrix,cols,start):
            for j in range(start,cols):
                matrix[row][j] = 0
        def makeColumnZero(rows,matrix,col,start):
            for j in range(start,rows):
                matrix[j][col] = 0
        """
        Do not return anything, modify matrix in-place instead.
        """
        firstRow = False
        firstColumn = False
        for col in range( cols):
            if matrix[0][col] == 0:
               firstRow = True
        for row in range( rows):
            if matrix[row][0] == 0:
               firstColumn = True
        # 1 to n
        for row in range(1,rows):
            for col in range(1,cols):
                if matrix[row][col] == 0:
                  matrix[0][col] = matrix[row][0] = 0 # place 0 at first cell
        # now turn to make zeros
        for row in range(1,rows):
            if matrix[row][0] == 0:
                makeRowZero(row,matrix,cols,1)
        for col in range(1,cols):
            if matrix[0][col] == 0:
                makeColumnZero(rows,matrix,col,1)
        if firstRow:
            makeRowZero(0,matrix,cols,0)
        if firstColumn:
            makeColumnZero(rows,matrix,0,0)
             