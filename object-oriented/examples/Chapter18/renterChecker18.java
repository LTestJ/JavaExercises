import java.util.Scanner;

public class renterChecker18
{
  public static void main (String[] args)
  {
    // Declare a Scanner and two integer variables
    Scanner scan = new Scanner( System.in );
    int age, credit;

    // get the age of the renter
    System.out.println("How old are you?");
    age = scan.nextInt() ;

    // get the credit line
    System.out.println("How much credit do you have?");
    credit = scan.nextInt() ;

    // check that both qualifications are met

    if ( age >= 21 && credit >=10000 )
      System.out.println("Enough to rent this car!" );
    else
      System.out.println("Have you considered a bicycle?" );
  }
}
