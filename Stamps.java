import java.util.*;
import java.lang.*;
import java.io.*;

class Stamps
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int more =  sc.nextInt();
            int no = sc.nextInt();
            ArrayList<Integer> a1 = new ArrayList<Integer>();

            for(int j=0;j<no;j++)
            {
                int x = sc.nextInt();
                a1.add(x);
            }

            Collections.sort(a1);

            long sum = 0;
            int count = 0;
            for(int l =a1.size()-1;l>=0;l--)
            {
                sum += a1.get(l);
                count++;
                if(sum >= more)
                {
                    break;
                }
            }
           // System.out.println(sum);
        
            if(sum >= more)        
            {
                System.out.println("Scenario #"+ (i+1) + ":");
                System.out.println(count);
            }
            else
            {
                System.out.println("Scenario #"+ (i+1) + ":");
                System.out.println("impossible");
            }
        }
    }
}
        
