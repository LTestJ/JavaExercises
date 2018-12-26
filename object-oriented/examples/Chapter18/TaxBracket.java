// IRS Weigh-in
//
// Income between $24000 and $58150 inclusive
//
import java.text.*;
import java.util.Scanner;
public class TaxBracket
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int income;
    DecimalFormat numform = new DecimalFormat("00,000");

    // get the income
    System.out.println("What is your income?");
    income = scan.nextInt();

    // check that the income is within range for the 28% bracket
    if (income >= 24000 && income <= 58150)
      System.out.println("Your income: " + numform.format(income) + " In the 28% bracket." );
    else
      System.out.println("Your income: " + numform.format(income) + " Time for a tax audit!" );
  }
}
