import java.util.*;
import java.lang.*;
import java.io.*;

class Nsteps
{
    void value(int x,int y)
    {
        if(x == y || x-y ==2)
        {
            if(x%2 == 0)
            {
                System.out.println(x+y);
            }
            else
            {
                System.out.println(x+y-1);
            }
        }
        else
        {
            System.out.println("No Number");
        }
        
    }

    public static void main(String [] args) throws Exception
    {   
        Nsteps n = new Nsteps();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        
        for(int i=0;i<N;i++)
        {
            String[] data = reader.readLine().split(" ");
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);

            n.value(x,y);
        }
    }

}




        
