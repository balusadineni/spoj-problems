import java.util.*;
import java.lang.*;
import java.io.*;

class Permut2
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        while(n != 0)
        {
            int[] a1 = new int[1000005];
            int[] a2 = new int[n+1];
            int i;
            for(i=1;i<=n;i++)
            {
                a1[i] = in.nextInt();
                a2[a1[i]] = i;
            }
            for(i=1;i<=n;i++)
            {
                if(a1[i]!=a2[i])
                {
                    break;
                }
            }
            if(i == n+1)
                System.out.println("ambiguous");
            else
                System.out.println("not ambiguous");

            n = in.nextInt();
        }
        return;
    }
}

