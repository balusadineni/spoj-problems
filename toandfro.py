while(1):

        x = int(raw_input())
        final = ''
        if(x > 0):
            cipher = raw_input()
            l1 = [cipher[i:i+x] for i in range(0,len(cipher),x)]


            l2 = [list(l1[i]) for i in range(len(l1))]

            for i in range(1,len(l2),2):
                l2[i] = l2[i][::-1]

            for i in range(x):
                for j in range(len(l2)):
                    final += l2[j][i]

            print final

        else:
            if(x == 0):
                break
            break
        final = ''
