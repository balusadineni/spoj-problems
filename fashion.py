T = int(raw_input())

while(T>0):
    N = int(raw_input())
    l1 = raw_input().split(" ")
    l2 = raw_input().split(" ")
    l1 = [int(x) for x in l1]
    l2 = [int(x) for x in l2]
    l1.sort()
    l2.sort()

    sum1 = 0
    for i in range(N):
        sum1 += l1[i]*l2[i]

    print sum1
    T = T-1



