class Solution:
    def countBattleships(self, board: List[List[str]]) -> int:
        n = len(board)
        m = len(board[0])
        def dfs(i,j):
            if 0<=i<n and 0<=j<m:
               if board[i][j]!='X':
                  return
               board[i][j]='V'
               dfs(i+1,j)
               dfs(i,j+1)
        count = 0
        for i in range(n):
            for j in range(m):
                if board[i][j] =='X':
                    dfs(i,j)
                    count+=1
        return count
              