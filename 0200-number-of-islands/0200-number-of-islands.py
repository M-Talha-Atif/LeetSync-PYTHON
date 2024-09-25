class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def dfs(grid, i, j):
            if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]) or grid[i][j]!="1":
               return
            grid[i][j] = "M"
            dfs(grid,i-1,j)
            dfs(grid,i,j-1)
            dfs(grid,i+1,j)
            dfs(grid,i,j+1)

        def bfs(grid, i, j):
            que = []
            que.append( (i,j) )
            while que:
                  m,n = que.pop(0) 
                  grid[m][n] = "M"

                  directions = [[1,0],[-1,0],[0,1],[0,-1]]
                  for dr,dc in directions:
                    r,c = m + dr, n + dc
                    if 0 <=r <  len(grid) and  0  <=c  < len(grid[0]) and grid[r][c]=='1':
                        que.append((r,c))
                  
        
            # directions = [[1,0],[-1,0],[0,1],[0,-1]]
            # for dr,dc in directions:
            #     r,c = i + dr, j + dc
            #     if 0  <=r <  i and 0<=c<j :
            #        dfs(grid,r,c)
        count = 0
        for i in range(len(grid)):
            for j in range( len(grid[0])):
                if grid[i][j]=="1":
                   count+=1
                   bfs(grid,i,j)
                   
        return count

        