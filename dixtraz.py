def s_distance(adj,node):
    visited[node] = 1
    que.append(node)
    while len(q) != 0:
        node = que[0]
        que = que[1:]
        for i in range(N):
            if adj[node][i]





que = []
adj = []
N = int(raw_input())
distamce = [-1]*N
visited = [0]*N



