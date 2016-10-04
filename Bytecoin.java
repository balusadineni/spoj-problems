import java.util.*;
import java.io.*;
import java.lang.*;

class ByteCoins
{
    public static HashMap<Long,Long> dp = new HashMap<Long,Long>();

    public static long dollers(long N)
    {
        if(N == 0)
            return 0;
        if(dp.get(N) != null) return dp.get(N);

        long tmp = dollers(N/2)+dollers(N/3)+dollers(N/4);

        if(tmp > N)
            dp.put(N,tmp);
        else
            dp.put(N,N);
        
        return dp.get(N);

    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String line;
        while(sc.hasNextLong())
        {
            System.out.println(dollers(sc.nextLong()));
        }
        return;
    }

}
