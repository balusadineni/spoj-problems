
y = []
z = [0,0,0]

while(1):
    x = raw_input()
    xy = x.split(" ")
    xy = [int(xy[i]) for i in range(len(xy))]
    if xy == z:
        break
    y.append(xy)




for x in y:
    if (x[1]-x[0] == x[2]-x[1]):
        diff = x[2]-x[1]
        print "AP ",(x[2]+diff)
    elif (x[1]/x[0] == x[2]/x[1]):
        far = x[2]/x[1]
        print "GP ", (x[2]*far)



