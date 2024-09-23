class Solution:
    def isBipartite(self, graph: List[List[int]]) -> bool:
        adj = graph
        V = len(graph)
        # for i in range(V):
        #     adj[i] = []
        # for i in range(V):
        #     for j in range(V):
        #       if i!=j:
        #          adj[i].append(j)
        def bfs(adj, passedNode, colors, current):
            que = [passedNode]
            colors[passedNode] = current
            # que m whi jaye ga jisko color mil gya huga
            while que:
                node = que.pop(0)
            
                for child in adj[node]:
                   if child in colors and colors[child] == colors[node]:
                        return False
                   if child not in colors:
                      colors[child] = 1 - colors[node]
                      que.append(child)   
            return True
        
        
        def dfs(adj, node, colors, current):
            colors[node] = current
            for child in adj[node]:
                if child in colors and colors[child] == current:
                   return False
                if child not in colors and dfs(adj, child, colors, 1 - current) == False:
                   return False    
            return True
        colors = {}
        current = 0 
        for i in range(V):
            if i not in colors and bfs(adj, i, colors, current)==False:
               return False
        return True
              
