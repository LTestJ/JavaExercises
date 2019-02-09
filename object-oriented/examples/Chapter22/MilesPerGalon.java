
import java.util.Scanner;

public class MilesPerGalon
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int value1, value2;
    int mileage = 0;
    int galon = 0;

    while (true)
    {
      System.out.print( "Initial Miles (enter -1 to quit): " );
      value1 = scan.nextInt();
      if (value1 != -1)
      {
        System.out.println("Bye");
      }
      else
      {
        System.out.print("\nEnter Final Miles: ");
        value2 = scan.nextInt();
        System.out.print("Galon: ");
        galon = scan.nextInt();
        mileage = (value2 - value1)/galon;
        System.out.print("Miles per Galon: " + mileage );
      }
    }
  }
}

