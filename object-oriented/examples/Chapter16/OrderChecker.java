import java.util.Scanner;

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

    int cost;
    cost = bolts * 5 + nuts * 3 + washers *1 ;

    if ( bolts != nuts )
    {
       if (bolts > nuts)
          System.out.println("Nuts are too low " );
       else
          System.out.println( "Nuts are too much ");
    }
    else
    {
       if (bolts < 2 * washers) 
          System.out.println("Too less Washers");
       else
          System.out.println("Too much Washers");
    }
    System.out.println("Order is OK " );
    System.out.println("Total Cost: " + cost);

  }
}


