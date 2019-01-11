import java.text.*;
import java.util.*;

public class Ex1_Delicate
{
  public static void main (String[] args)
  {
    String item;
    float price;
    int delivery;
    float deliveryCharge;
    final float ExpDeli = 3;
    final float NorDeli = 2;

    final int total = 20;

    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("0.00");
    System.out.print("Enter item: ");
    item = scan.nextLine();

    System.out.print("Enter price in cents: ");
    float priceInCents = scan.nextFloat();
    price = priceInCents /100;

    System.out.print("Overnight Delivery: (0==No, 1==yes): ");
    delivery = scan.nextInt();

    System.out.println("Invoice: ");
    System.out.println( String.format( "  %-20s%s",item, price));

    float totalCost =0;

    if (delivery == 1) {
       if (price > 10) {

          System.out.println( String.format ( "  %-21s%s" , "Delivery", ExpDeli));
          System.out.println( String.format ( "  %-20s%s" , "total", price+ExpDeli));
       }
       else
       {
          System.out.println( String.format ( "  %-20s%s" , "Delivery", NorDeli+ExpDeli));
          System.out.println( String.format ( "  %-20s%s" , "total", price+NorDeli+ExpDeli));

       }
    }
    else
    {
       if (price > 10) {
          System.out.println( String.format ( "  %-20s%s" , "Delivery", "00.00"));
          System.out.println( String.format ( "  %-20s%s" , "total", price));

       }
       else
       {
          System.out.println( String.format ( "  %-20s%s" , "Delivery", NorDeli));
          System.out.println( String.format ( "  %-20s%s" , "Delivery", price+NorDeli));

       }
    }
  }
}

