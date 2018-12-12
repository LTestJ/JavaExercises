import java.util.Scanner;
import java.lang.Math;
public class WindChill
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double speed;
    System.out.println("Enter wind speed: ");
    speed = scan.nextDouble();

    double temp;
    System.out.println("Enter temperature: ");
    temp = scan.nextDouble();

    double wci = 35.74 + (0.6215 * temp) - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);

    if ( speed < 3 )
       System.out.println("WindChill: " + temp );
    else
    {
       if ( temp > 50 )
          System.out.println("WindChill: " + temp );
       else
          System.out.println("WindChill: " + wci );
    }
  }
}

