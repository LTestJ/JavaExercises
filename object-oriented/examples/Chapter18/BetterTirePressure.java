import java.text.*;
import java.util.*;

public class BetterTirePressure
{
  public static void main (String[] args)
  {
    int pressureFrontLt, pressureFrontRt;
    int pressureBackLt, pressureBackRt;

    System.out.println("Welcome to Costco Tire Center!");
    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("00.00");

    System.out.println("\nInput Right Front Pressure: ");
    pressureFrontRt = scan.nextInt();
    if (pressureFrontRt < 35 || pressureFrontRt > 45) {
       System.out.println("Warning: pressure is out of range");
    }

    System.out.println("\nInput Left Front Pressure: ");
    pressureFrontLt = scan.nextInt();
    if (pressureFrontLt < 35 || pressureFrontLt > 45) {
       System.out.println("Warning: pressure is out of range");
    }

    System.out.println("\nInput Right Back Pressure: ");
    pressureBackRt = scan.nextInt();
    if (pressureBackRt < 35 || pressureBackRt > 45) {
       System.out.println("Warning: pressure is out of range");
    }

    System.out.println("\nInput Left Back Pressure: ");
    pressureBackLt = scan.nextInt();
    if (pressureBackLt < 35 || pressureBackLt > 45) {
       System.out.println("Warning: pressure is out of range");
    }

    if ( (pressureFrontRt == pressureFrontLt) && (pressureBackRt == pressureBackLt)
          && ( !(pressureBackLt < 35) || !(pressureBackLt > 45) )
          && ( !(pressureBackRt < 35) || !(pressureBackRt > 45) )
          && ( !(pressureFrontLt < 35) || !(pressureFrontLt > 45) )
          && ( !(pressureFrontRt < 35) || !(pressureFrontRt > 45) ) )
    {
       System.out.println("\nInflation is OK");
    }
    else
    {
       System.out.println("\nInflation NOT OK");
    }
  }
}

