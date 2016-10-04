import java.util.*;
import java.lang.*;
import java.io.*;

class AE00
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        

        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i% j==0)
                {
                   // System.out.println(i+" "+j);

                    if(j == i/j)
                        count++;
                    count++;
                }
            }
        }
        System.out.println(count/2);
    }
}
