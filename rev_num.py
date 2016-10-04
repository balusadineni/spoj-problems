x = raw_input()
x = int(x)
for i in range(x):
    A = raw_input()
    B = raw_input()
    A = A[::-1]
    B = B[::-1]
    Y = int(A)+int(B)
    Y = str(Y)
    print Y[::-1]

