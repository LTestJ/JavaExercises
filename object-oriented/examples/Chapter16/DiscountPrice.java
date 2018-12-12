import java.util.Scanner;

public class DiscountPrice
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double amount;

    System.out.println("Enter amount of purchase: ");
    amount = scan.nextInt();

    if ( amount > 10.00 )
      System.out.println("Discounted price: " + amount * .90 );
    else
      System.out.println("Amount of Price: " + amount);
  }
}

