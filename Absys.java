import java.util.*;
import java.lang.*;
import java.io.*;

class Absys
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(sc.readLine());
        
        while(T>0)
        {
            sc.readLine();
            String s = new String();
              s=  sc.readLine();
            String[] splited = s.split("\\s+");
            
            String m = new String("machula");
            if(splited[0].contains(m))
                System.out.println(String.valueOf(Integer.parseInt(splited[4])-Integer.parseInt(splited[2]))+ " + " + splited[2] + " = " + splited[4]);
            else if(splited[2].contains(m))
                System.out.println(splited[0] + " + " +String.valueOf(Integer.parseInt(splited[4])-Integer.parseInt(splited[0]) ) + " = " +  splited[4]);
            else if(splited[4].contains(m))
                System.out.println(splited[0] + " + " + splited[2] + " = " +  String.valueOf(Integer.parseInt(splited[0])+Integer.parseInt(splited[2])));

            T--;
        }
    }
}
