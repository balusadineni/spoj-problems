import java.util.*;
import java.io.*;
import java.lang.*;

class LastDig
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0) {
        

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b == 0)
            System.out.println(1);
        else 
        {

        b = b%4;
        
        if(b==0)
            b = 4;

        double d =  Math.pow(a,b);
        
        System.out.println((int)d%10); }
        T--;
        }
    }
}
