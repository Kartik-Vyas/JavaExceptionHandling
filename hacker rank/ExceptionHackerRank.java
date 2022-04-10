package vyas.ExceptionHandling;
import java.util.Scanner;

class MyCalculatorException extends RuntimeException
{
   MyCalculatorException()
   {
       super();
   }
    MyCalculatorException(String message)
    {
        super(message);
    }
}
public class ExceptionHackerRank {
    public static long power(int a,int b) throws MyCalculatorException
    {
        int n = a;
        int p = b;

        if(a<0 || b<0)
        {
        throw new MyCalculatorException("n or p should not be negative");
        }
        else if (a==0 || b==0)
        {
            throw new MyCalculatorException("n or p should not be zero");
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
                int a = sc.nextInt();
                int b = sc.nextInt();
                try {
                    System.out.println(ExceptionHackerRank.power(a, b));
                }
                catch(MyCalculatorException e){
                    System.out.println(e);
                }
            }
        }
