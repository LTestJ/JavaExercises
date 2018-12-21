import java.text.*;
import java.util.*;

public class Ex5_Dumpster
{
  public static void main (String[] args)
  {
    int weight;
    int additionalWeight = 0;
    int basicCharge = 20;
    int additionalCharge = 8;
    String name;

    System.out.println("Welcome to The New Britain Town Dump");
    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("00.00");
    System.out.print("Enter  your  name: ");
    name = scan.nextLine();

    System.out.print("total weight LBS : ");
    weight = scan.nextInt();
    System.out.println("   Minimum charge: $20 ");

    if ( weight <= 200 )
    {
       System.out.println("Your total charge: $" + basicCharge );
    }
    else
    {
       additionalWeight = (weight - 200);
       System.out.println("Additional Weight: "+ additionalWeight );

       additionalCharge = additionalCharge *  (weight - 200)/100;
       System.out.println("Additonal  charge: $" + additionalCharge);
       System.out.println("Your total charge: $" + (basicCharge + additionalCharge) );
    }
  }
}

