import java.util.Locale;
import java.text.*;
import java.util.*;

public class ValueOfDeposit
{
  public static void main ( String[] args )
  {

    double interestRate;
    Scanner scan = new Scanner( System.in );
    System.out.print  ("Enter Interest Rate: ");
    interestRate = scan.nextDouble();

    double initialDeposit ;
    System.out.print  ("Enter initialDeposit: ");
    initialDeposit = scan.nextDouble();

    double term;
    System.out.print  ("Enter Number of Years: ");
    term = scan.nextDouble();

    double numOfTimes;
    System.out.print  ("Enter numOfTimes per year: ");
    numOfTimes = scan.nextDouble();

    double value;
    DecimalFormat numform = new DecimalFormat("$00.00");
// 	V= P(1 + r/n) to the power of nt
    value = initialDeposit * Math.pow( (1 + 
	(interestRate/numOfTimes)), (numOfTimes * term ) );
    System.out.println( "value = " + numform.format(value) );
  }
}
