class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        board = grid
        n = len(board)
        m = len(board[0])
        visited = dict()
        def dfs(i,j):
            if 0<=i<n and 0<=j<m:
               if board[i][j]!=1 or (i,j) in visited:
                  return
               board[i][j]= 0
               visited[(i,j)] = True
               dfs(i+1,j)
               dfs(i,j+1)
               dfs(i-1,j)
               dfs(i,j-1)
            #    dfs(i+1,j+1)
            #    dfs(i+1,j-1)
            #    dfs(i-1,j+1)
            #    dfs(i-1,j-1)
        count = 0
        for i in range(n):
            for j in range(m):
                if board[i][j] ==1:
                    dfs(i,j)
                    count+=1
                    
        return count
        