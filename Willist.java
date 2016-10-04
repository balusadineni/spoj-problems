import java.util.*;
import java.lang.*;
import java.io.*;

class Willist
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if((n & (n-1))==0)
        {
            System.out.println("TAK");
        }
        else
        {
            System.out.println("NIE");
        }
    }
}
