import java.util.Scanner;
import java.text.*;

public class CreditCardPay
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat();

    double balanceAmt;
    double rate;
    double monthly;
    double monthlyTot = 0;
    double interestDue = 0;
    int month = 0;

    System.out.print("Enter beginning balance: ");
    balanceAmt = scan.nextDouble();
    System.out.print("Monthly Interest rate: ");
    rate = scan.nextDouble();
    System.out.print("Enter Monthly Amount: ");
    monthly = scan.nextDouble();

    while (balanceAmt >= 0)
    {
      interestDue = balanceAmt * rate/100;
      balanceAmt = (balanceAmt - monthly) + interestDue;

      month = month + 1;
      monthlyTot = monthlyTot + monthly;
/*
      if ( balanceAmt < monthly)
      {
        System.out.println("Final Payment : " + (balanceAmt - monthly) );
        break;
      }
*/
      System.out.println("Month: " + month + "\tBalance Amount: " + numform.format(balanceAmt) + 
         "\tTotal payment: " + monthlyTot );

    }
  }
}
