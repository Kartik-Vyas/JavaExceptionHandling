import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shape 
{
    public Square(int x)
    {
        width = x;
    }
    public void area()
    {
        int value = width * width ;
        System.out.println(value);
    }
}
class Circle  extends Shape 
{
    public Circle (int y)
    {
        width = y;
    }
    public void area()
    {
        double  value1 =Math.PI*(double ) width * width;
        System.out.println(value1);
    }
}


public class ShapeDemo {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
