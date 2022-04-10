import java.io.*;
import java.util.*;

public class ExceptinHandlingWithoutConstructor {
    public static long power(int a,int b) throws Exception
    {
        int n = a;
        int p = b;
        if(a<0 || b<0)
        {
        throw new Exception("n or p should not be negative.");
        }
        else if (a==0 && b==0)
        {
            throw new Exception("n and p should not be zero.");
        }
        else
        {
            long value = (long) Math.pow(a,b);
            return value;
        }
    }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
                while(sc.hasNext() )
                {
                int a = sc.nextInt();
                int b = sc.nextInt();
                try {
                    System.out.println(ExceptionHackerRank.power(a, b));
                }
                catch(Exception e){
                    System.out.println(e);
                }
                }
            }
        }
