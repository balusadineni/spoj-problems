import java.io.*;
import java.lang.*;
import java.util.*;

class Army
{
    public static void main(String [] args) throws IOException
    {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       

       int T = Integer.parseInt(in.readLine());

       while(T>0)
       {
           in.readLine();
           StringTokenizer tokenizer = new StringTokenizer(in.readLine());
           int Ng = Integer.parseInt(tokenizer.nextToken());
           int Nm = Integer.parseInt(tokenizer.nextToken());
            

           int NgStrength = 0;

           tokenizer = new StringTokenizer(in.readLine());
           for(int i=0;i<Ng;i++)
           {

               int x = Integer.parseInt(tokenizer.nextToken());
               if( NgStrength < x )
                   NgStrength = x;
               
           }
           int NmStrength = 0;
           tokenizer = new StringTokenizer(in.readLine());
           for(int i=0;i<Nm;i++)
           {
               int y = Integer.parseInt(tokenizer.nextToken());
               if( NmStrength < y )
                   NmStrength = y;
           }
           if(NmStrength == NgStrength || NgStrength > NmStrength)
               System.out.println("Godzilla");
           else
               System.out.println("MechaGodzilla");
        T--;
    }
  }
}

           


