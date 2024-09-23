class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        adj = [ ]
        for i in range(numCourses):
            adj.append([])
        # b -> a
        def dfs(adj,node,visited,inRecur,stack):
            visited[node] = True
            inRecur[node] = True
            for child in adj[node]:
                if child in visited and inRecur[child]:
                   return 1
                if child not in visited and dfs(adj,child,visited,inRecur)==1:
                    return 1 # cycle
            inRecur[node] = False
            stack.append(node)
            return 0 # no cycle
        for item in prerequisites:
            a,b = item
            adj[b].append(a)
        print(adj)
        visited = {}
        inRecur = {}
        stack = []
        for i in range(numCourses):
            if i not in visited and dfs(adj,i,visited,inRecur,stack)==1:
               return []
        return stack

        