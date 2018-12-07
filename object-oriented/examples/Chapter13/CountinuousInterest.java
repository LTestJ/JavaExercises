import java.util.* ;

public class CountinuousInterest
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double rate, years, principal, amount;

    // read in the interest rate, as a fraction,
    // years and principal
    System.out.print  ("Enter rate: ");
    rate = scan.nextDouble();
    System.out.print  ("Enter years: ");
    years = scan.nextDouble();
    System.out.print  ("Enter principal: ");
    principal = scan.nextDouble();

    // calculate the amount after years of growth
    amount =  principal  *  Math.exp( rate * years );
    // write out the result
    System.out.println("current amount: " + amount );
  }
}
