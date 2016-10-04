import Queue
N = raw_input()
N = int(N)


adj =[(0,1,1,0),(1,0,0,1),(1,0,1,0),(0,1,0,0)]

x = 0

"""for i in range(0,N):
    temp = []
    for j in range(0,N):
        x = raw_input()
        temp.append(int(x))
    adj.append(temp)

for i in range(0,N):
    for j in range(0,N):
        print adj[i][j]"""

que = []
visited =[0]*N
prossesed = [0]*N
list1 = [0]*N
Start = raw_input()
Start = int(Start)
node = Start
que.append(node)
while (len(que)) != 0:
    node = que[0]
    que = que[1:]
    for i in range(N):
        if(adj[node][i] == 1) and (prossesed[i] != 1):
            if(node == i):
                list1[i] = list1[i]+0
            else:
                list1[i] = 1+node
                que.append(i)
    prossesed[node]=1

for i in  range(len(list1)):
    print list1[i]








