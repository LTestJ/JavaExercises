import java.util.Scanner;

public class DollarsAfterForty
{

  public static void main( String[] args )
  {
    double dollars = 1000.00 ;
    double rate;
    int    year =  1 ;

    // Get the interest rate from the user

    Scanner scan = new Scanner( System.in );
    System.out.print("Enter the interest rate in percent: ");
    rate = scan.nextDouble()/100.0 ;

    // Calculate how much money is in the account after 40 years

    while (  year <= 40 )
    {
      // add another year's interest
      dollars =  dollars + dollars * rate;

      // add in this year's contribution
      dollars = dollars + 1000 ;

      year =  year + 1 ;
    }

    System.out.println("After 40 years at " + rate*100
      + " percent interest you will have " + dollars + " dollars" );
  }

}
