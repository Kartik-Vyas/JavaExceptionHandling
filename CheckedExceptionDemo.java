package vyas.ExceptionHandling;

class UnderAgeException extends Exception
{
    UnderAgeException()
    {
        super("you are under age");
    }
    UnderAgeException(String message)
    {
        super(message);
    }
}
public class CheckedExceptionDemo
        {
    public static void main(String[] args) {
      int age = 17;
      try {
          if (age < 18) {
              throw new UnderAgeException();
          }
      }
      catch(UnderAgeException e)
      {
          e.printStackTrace();
      }
      finally
      {
          System.out.println("hello");
      }
        System.out.println("welcome");
    }
}
