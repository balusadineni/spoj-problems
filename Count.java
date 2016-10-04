import java.io.*;
import java.lang.*;
import java.util.*;

class Count
{
    public static void main(String [] arg) throws IOException
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(in.readLine());
        
        while(T>0)
        {
            int n = Integer.parseInt(in.readLine());

            int i,sum=0;
            for(i=1;;i++)
            {
                sum += i;
                if(sum >= n)
                    break;
            }
            int pos = n-(sum-i);

            int tot = i+1;
            
            if(i%2 == 0)
                System.out.println("TERM "+n+ " IS "+pos+"/"+(tot-pos));
            else
                System.out.println("TERM "+n+ " IS "+(tot-pos)+"/"+pos);

            T--;
        }
    }
}


