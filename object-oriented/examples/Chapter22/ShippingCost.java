import java.util.Scanner;

public class ShippingCost
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int weight;
    double handling = 3.00;
    double rate = 0.25;
    double cost;

    while (true)
    {
      System.out.print( "\nEnter weight of order: " );
      weight = scan.nextInt();

      if (weight <= 0)
      {
        System.out.println("Bye");
        break;
      }
      else if (weight <= 10)
      {
        System.out.println("Shipping cost:$" + handling );
      }
      else
      {
        cost = handling + rate * (weight - 10);
        System.out.println( "Total cost:$" + cost );
      }
    }
  }
}
/*
while (True) {

   // read input
   weight =

   // check exiting condition
   if (weight == 0) {
   }

   // do logic
   over = weight - 10

   Price = 3 + over  * .25
}
*/
