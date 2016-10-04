ct = input()
st = 'machula'
while ct:
    ct -= 1
    raw_input()
    equation = raw_input().split()
    if st in equation[0]:
        print "%d + %s = %s" % (int(equation[4]) - int(equation[2]), equation[2], equation[4])
    elif st in equation[2]:
        print "%s + %d = %s" % (equation[0], int(equation[4]) - int(equation[0]), equation[4])
    elif st in equation[4]:
        print "%s + %s = %d" % (equation[0], equation[2], int(equation[0]) + int(equation[2]))