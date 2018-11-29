import java.util.*;

public class CorrectChange
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int change, dollar, quarter, dime, nickel, cent;
//    dollar  = 100;
//    quarter = 25;
//    dime = 10;
//    nickel = 5;
//    cent = 1;

    System.out.println("Enter the change: ");
    change = scan.nextInt();

    change / 100 = dollar;
    change % 100 = cent;

    System.out.println("That is " + dollar + " Dollars and  " + cent + 
"Cents" );
  }
}

