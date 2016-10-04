import java.util.*;
import java.io.*;
import java.lang.*;

class Feynman
{
    public static void main(String [] args) throws Exception 
    {
        int Sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            int N = Integer.parseInt(reader.readLine());
            if(N == 0)
                break;
            else
            {
                
                for(int i=1;i<=N;i++)
                {
                    Sum += i*i;
                }
                System.out.println(Sum);
                Sum = 0;
            }
        }
        
    }
}
