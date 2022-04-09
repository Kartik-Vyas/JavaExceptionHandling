package vyas.ExceptionHandling;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
