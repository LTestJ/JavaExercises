// Sports Car Purchase
//
// You need $25000 in cash or credit
//
import java.util.Scanner;

public class HotWheels
{
  public static void main (String[] args) 
  { 
    Scanner scan = new Scanner( System.in ); 
    int cash, credit ; 

    // get the cash
    System.out.print("How much cash? ");
    cash = scan.nextInt() ; 

    // get the credit line
    System.out.print("How much credit? ");
    credit = scan.nextInt() ; 

    // check that at least one qualification is met
    if ( cash >= 25000  ||   credit >= 25000 )
      System.out.println("Enough to buy this car!" );
    else
      System.out.println("What about a Yugo?" );

  }
}
