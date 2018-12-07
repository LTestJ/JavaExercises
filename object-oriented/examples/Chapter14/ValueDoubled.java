import java.util.Locale;
import java.text.*;
import java.util.*;

public class ValueDoubled
{
  public static void main ( String[] args )
  {
    double interestRate;
    Scanner scan = new Scanner( System.in );
    System.out.print  ("Enter Interest Rate: ");
    interestRate = scan.nextDouble();

    double value;
    DecimalFormat numform = new DecimalFormat("0.0");

    value = 72.0 / interestRate;
    System.out.println( "Years to Double the Deposit: " + numform.format(value));
  }
}
