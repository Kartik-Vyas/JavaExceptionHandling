package vyas.ExceptionHandling;

class UnderAgeException1 extends RuntimeException
{
    UnderAgeException1()
    {
        super("you are under age");
    }
    UnderAgeException1(String message)
    {
        super(message);
    }
}
public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new UnderAgeException("you are not eligible for voting");
            }
            else
            {
                System.out.println("Voting done");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("hello");
        }
        System.out.println("welcome");
    }
}
