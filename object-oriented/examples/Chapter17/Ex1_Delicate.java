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

    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("00.00");
    System.out.print("Enter the item: ");
    item = scan.nextLine();

    System.out.print("Enter the price in cents: ");
    float priceInCents = scan.nextFloat();
    price = priceInCents /100;

    System.out.print("Overnight Delivery: (0==No, 1==yes): ");
    delivery = scan.nextInt();

    System.out.println("Invoice: ");
    System.out.println("     " + item + "        " + numform.format(price));
    float totalCost =0;
    if (delivery == 1) {
       if (price > 10) {
          System.out.println("    Delivery     " + numform.format(ExpDeli));
          System.out.println("    total        " + numform.format(price + ExpDeli));
       }
       else
       {
          System.out.println("    Delivery     " + numform.format(NorDeli + ExpDeli) );
          System.out.println("    total        " + numform.format(price + NorDeli + ExpDeli));
       }
    }
    else
    {
       if (price > 10) {
          System.out.println("    Delivery     00.00");
          System.out.println("    total        " + numform.format( price) );
       }
       else
       {
          System.out.println("    Delivery     " + numform.format(NorDeli));
          System.out.println("    Total        " + numform.format(price + NorDeli) );
       }
    }
  }
}

