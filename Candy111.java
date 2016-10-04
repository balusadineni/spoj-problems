import java.util.*;
import java.lang.*;
import java.io.*;

class Candy111
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0;i<T;i++)
        {   
            sc.nextLine();

            int N = sc.nextInt();
            long sum = 0;
            for(int j=0;j<N;j++)
            {
                long a = sc.nextLong();
                sum = (sum+a)%N;
            }
            if(sum == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
     return;
    }
}
