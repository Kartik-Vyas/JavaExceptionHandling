import java.io.*;
import java.util.*;

public class TryCatchDemo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         try 
         {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c;
            c= x/y;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e1)
        {
            System.out.println(e1.getClass().getName());
        }
    }
}
