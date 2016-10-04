def LUE():
    l = []
    for i in range(5):
            val = raw_input()
            val = int(val)
            l.append(val)

    for i in range(len(l)):
        if l[i] == 42:
            x = i



    return l[0:x]

if __name__=="__main__":
    li=LUE()
    print li
