import java.text.*;
import java.util.*;

public class TirePressure
{
  public static void main (String[] args)
  {
    int pressureFrontLt, pressureFrontRt;
    int pressureBackLt, pressureBackRt;

    System.out.println("Welcome to Costco Tire Center !");
    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("00.00");
    System.out.print("\nInput Right Front Pressure: ");
    pressureFrontRt = scan.nextInt();

    System.out.print("\nInput Left Front Pressure: ");
    pressureFrontLt = scan.nextInt();

    System.out.print("\nInput Right Back Pressure: ");
    pressureBackRt = scan.nextInt();

    System.out.print("\nInput Left Back Pressure: ");
    pressureBackLt = scan.nextInt();

    if ( (pressureFrontRt == pressureFrontLt) && (pressureBackRt == pressureBackLt) )
    {
       System.out.println("\nInflation is OK");
    }
    else
    {
       System.out.println("\nInflation NOT OK");
    }
  }
}

