import java.util.Scanner;

public class CircleArea
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double radius, area ;      // declaration of double variables

    System.out.println("Enter radius :");
    radius = scan.nextDouble();       // read chars and convert to double

    area = radius * radius * Math.PI;

    System.out.println("The area of circle of Radius " + radius + " is " + area );
  }
}

