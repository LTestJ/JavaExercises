import java.util.*;

public class OrderChecker
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int bolts;
    System.out.println("Enter # of Bolts: ");
    bolts = scan.nextInt();

    int nuts;
    System.out.println("Enter # of Nuts: ");
    nuts = scan.nextInt();

    int washers;
    System.out.println("Enter # of Washers: ");
    washers = scan.nextInt();

    boolean found_error = false;

    int cost;
    cost = bolts * 5 + nuts * 3 + washers * 1 ;

    if ( bolts != nuts ) {
       if (bolts < nuts ) {
          System.out.println("Check the order : too many nuts");
       }
       else
       {
          System.out.println("Check the order: too few nuts ");
       }

       found_error = true;
    }

    if ( bolts != 2 * washers ) {
       if ( 2 * washers > bolts) {
          System.out.println("Check the order : too many washers");
       }
       else
       {
          System.out.println("Check the order : too few washers");
       }

       found_error = true;
    }

    if (found_error == false) {
       System.out.println("Order is Ok");
    }
    System.out.println( "Total Cost: " + cost );

  }
}


