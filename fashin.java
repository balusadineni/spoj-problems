import java.util.*;
import java.io.*;
import java.lang.*;

class Fashin
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T>0)
        {
            int N = sc.nextInt();
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            ArrayList<Integer> a2 = new ArrayList<Integer>();

            for(int i=0;i<N;i++)
            {
                int tmp = sc.nextInt();
                a1.add(tmp);
            }

            for(int i=0;i<N;i++)
            {   
                 int tmp = sc.nextInt();
                 a2.add(tmp); 
            }   

            Collections.sort(a1);
            Collections.sort(a2);
            long sum1 = 0;

            for(int i=0;i<N;i++)
                sum1 += a1.get(i)*a2.get(i);


            System.out.println(sum1);
            T--;
         }
    }
}

