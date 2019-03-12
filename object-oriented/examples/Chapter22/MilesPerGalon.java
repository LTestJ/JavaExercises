
import java.util.Scanner;

public class MilesPerGalon
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int value1, value2;
    float mileage = 0;
    float galon = 0;

    while (true)
    {
      System.out.print( "\n\nEnter Initial Miles (-1 to quit): " );
      value1 = scan.nextInt();
      if (value1 == -1)
      {
        System.out.println("Bye");
        break;
      }
      else
      {
        System.out.print("Enter Final Miles: ");
        value2 = scan.nextInt();
        System.out.print("Galon: ");
        galon = scan.nextFloat();
        mileage = (value2 - value1)/galon;
        System.out.print("Miles per Galon: " + mileage );
      }
    }
  }
}

