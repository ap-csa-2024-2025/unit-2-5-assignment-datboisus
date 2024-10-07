import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Circle c1 = new Circle(10.1);
    Circle c2 = new Circle(14.0);
    Circle c3 = new Circle(20.5);
    String circle1 = c1.toString();
    String circle2 = c2.toString();
    String circle3 = c3.toString();
    System.out.println(circle1 + "\n" + circle2 + "\n" + circle3);

    Scanner sc = new Scanner(System.in);
    
  }
}
