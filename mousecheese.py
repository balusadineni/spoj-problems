N = int(raw_input())
M = int(raw_input())




def find_path(adj,a,b,distance):
    paths = []
    start = adj[a][b]
    if adj[a][b] == 'c':
        print 'YES'
    if adj[a][b] not in ('c','.'):
        return
    if a-1!=0:
        if start != 'm':
            adj[a][b] == '1'
        find_path(adj,a-1,b,distance+1)
        adj[a][b] = start
    if a+1 != N:
        if start != 'm':
            adj[a][b] == '1'
        find_path(adj,a+1,b,distance+1)
        adj[a][b] = start
    if b-1 != 0:
        if start !='m':
            adj[a][b] == '1'
        find_path(adj,a,b-1,distance+1)
        adj[a][b] = start
    if b+1 != N:
        if start != 'm':
            adj[a][b] =='1'
        find_path(Adj,a,b+1,distance+1)
        adj[a][b] = start




if "__name__" == "__main__":

    adj = []

    for i in range(N):
        temp = []
        for j in range(M):
            x = raw_input()
            if(x == 'm'):
                a,b=i,j
            temp.append(x)
        adj.append(temp)


    find_path(adj,a,b,0)






