import java.util.Scanner;

public class DollarsAfterForty
{

  public static void main( String[] args )
  {
    double down;
    double rate;
    int    year =  1 ;
    double contribution;

    // Get the interest rate from the user
    Scanner scan = new Scanner( System.in );
    System.out.print("Enter the interest rate in percent: ");
    rate = scan.nextDouble()/100.0 ;
    System.out.print("Enter your down payment: ");
    down = scan.nextDouble();
    System.out.print("Enter annual contribution: ");
    contribution = scan.nextDouble();

    while (down <= 1000000)
    {
      // add another year's interest
      down =  down + down * rate;
      System.out.println("Current value: " + down );
      // add in this year's contribution
      down = down + contribution ;
      year =  year + 1 ;
    }
    System.out.println("After 40 years at " + rate * 100
      + " percent interest you will have " + down + " dollars" );
  }

}
