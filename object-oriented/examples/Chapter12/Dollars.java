import java.util.*;

public class Dollars
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int cents, cent, dollar, divisor;
    divisor  = 100;

    System.out.println("Enter the cents: ");
    cents = scan.nextInt();
    dollar = cents / divisor;
    cent = cents % divisor;

    System.out.println(cents + " cents is " + dollar + " Dollars and " + cent + " Cents" );
  }
}

