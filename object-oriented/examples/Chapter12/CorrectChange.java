import java.util.*;

public class CorrectChange
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int change, dollar, quarter, dime, nickel, cent, quotient1, quotient2, quotient3, quotient4;

    System.out.println("Enter the change: ");
    change = scan.nextInt();

    dollar = change / 100;
    quotient1 = change % 100;

    quarter = quotient1 / 25;
    quotient2 = quotient1 % 25;

    dime = quotient2 /10;
    quotient3 = quotient2 % 10;

    nickel = quotient3 / 5;
    quotient4 = quotient3 % 5;


    System.out.println( change + " is " + dollar + " Dollars and " + quarter + 
" Quarter " + dime + " Dime " + nickel + " Nickel " + quotient4 + " pennies " );
  }
}

