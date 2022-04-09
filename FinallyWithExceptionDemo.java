package vyas.ExceptionHandling;

public class FinallyWithExceptionDemo {

    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("hello");
        }
    }
}


