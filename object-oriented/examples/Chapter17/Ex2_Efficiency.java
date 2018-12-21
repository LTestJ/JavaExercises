import java.text.*;
import java.util.*;

public class Ex2_Efficiency
{
  public static void main (String[] args)
  {
    float Tair;
    float Tsteam;
    float efficiency;

    Scanner scan = new Scanner( System.in );
    System.out.print("Enter Air Temperature: ");
    Tair = scan.nextFloat();

    System.out.print("Enter Steam Temperature: ");
    Tsteam = scan.nextFloat();

    if ( Tsteam < 373 )
    {
       System.out.println("No Steam, No Efficiency" );
    }
    else
    {
       efficiency = 1 - (Tair/Tsteam);
       System.out.println("Efficiency: " + efficiency );
    }
  }
}

