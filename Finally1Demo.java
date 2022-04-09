package vyas.ExceptionHandling;

public class Finally1Demo {
    public static void main(String[] args) {
        try {
            int a = 100, b = 2, c;
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("hello");
        }
    }
}
