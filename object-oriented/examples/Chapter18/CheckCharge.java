import java.text.*;
import java.util.*;

public class CheckCharge
{
  public static void main (String[] args)
  {
    double balChkng;
    double balSavng;
    double serviceCharge = 0.15;
    int NumOfChecks = 1;

    System.out.println("Welcome to The Banking Center");
    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("00.00");

    System.out.print("Enter your balance in Checking acct:$ ");
    balChkng = scan.nextDouble();

    System.out.print("Enter your balance in  Savings acct:$ ");
    balSavng = scan.nextDouble();

    System.out.print("Enter num of Checks you want to write: ");
    NumOfChecks = scan.nextInt();

    if ( balChkng >= 1000 || balSavng >= 1500 )
    {
       System.out.println("No Service Charge for you !! " );
    }
    else
    {
       serviceCharge = serviceCharge * NumOfChecks;
       System.out.println("Your Service Charge:$ "+ numform.format(serviceCharge));
    }
  }
}

