
def path(adj,a,record):
    record[a]='yes'
    for i in range(a,N):
        if adj[a][i] == 1:
            if record[i] != 'yes':
                path(adj,i,record)


N =int(raw_input())
record = ['No']*N
adj = [(0,1,1,1,0),(1,0,0,1,0),(1,0,0,0,0),(1,1,0,0,0),(0,0,0,0,0)]
path(adj,0,record)

print record
