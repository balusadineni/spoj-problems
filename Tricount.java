import java.util.*;
import java.lang.*;
import java.io.*;

class Tricount
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            long n = sc.nextInt();
            long sum = n * (n + 2) * (2 * n + 1) / 8;

            System.out.println(sum);
        }
    }
}
