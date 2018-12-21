import java.text.*;
import java.util.*;

public class CarPurchase
{
  public static void main (String[] args)
  {
    final int basePrice  = 20000;   // base price in dollars
    final int pinPrice   =   250;   // pin stripe price
    final int brakePrice =   800;   // anti-lock brake price

    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("00,000");
    System.out.println("The BasePrice is: $" + numform.format(basePrice) );
    int answer;
    int totalCost = basePrice;

    System.out.print("Do you want pin stripes (0 or 1)? ");

    answer = scan.nextInt();
    if ( answer == 1)
    {
      totalCost = totalCost + pinPrice;
    }

    System.out.print("Do you want anti-lock brakes (0 or 1)? ");
    answer = scan.nextInt();
    if ( answer == 1)
    {
      totalCost = totalCost + brakePrice;
    }
    System.out.println("Total cost is: $" + numform.format(totalCost) );
  }
}
