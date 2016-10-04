import java.util.*;
import java.lang.*;
import java.io.*;

class ToAndFro
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            
            int x = sc.nextInt();
            if(x > 0)
            {
                String cipher = new String();
                cipher = sc.next();

                ArrayList<String> a1 = new ArrayList<String>();

                for(int i=0;i<cipher.length();i++)
                {
                    a1.add(cipher.substring(i,i+x));
                    i = i+x-1;
                }

                for(int i=1;i<a1.size();i++)
                {
                    String r = new StringBuffer(a1.get(i)).reverse().toString();
                    a1.set(i,r);
                    i++;
                }

                String final1 = new String("");

                for(int i=0;i<x;i++)
                {
                    for(int j=0;j<a1.size();j++)
                        final1 += a1.get(j).charAt(i);
                }   

                System.out.println(final1);
            }
            else
                break;
        }

        return;
    }
}


