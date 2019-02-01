import java.util.Scanner;

public class  SquareRoot
{
  public static void main( String[] args )
  {
    final double smallValue = 1.0E-14 ;
    double N ;
    double guess = 1.00 ;

    // get the number from the user
    Scanner scan = new Scanner( System.in );
    System.out.print("Enter the number: ");
    N = scan.nextDouble();

    if ( N >= 0.0 )
    {
      while ( Math.abs( N/(guess*guess) - 1.0 ) > smallValue )
      {
         // calculate a new value for the guess
         guess = N/(2 * guess) + guess/2 ;

      }
      System.out.println("The square root of " + N + " is " + guess ) ;
    }

    else
    {
      System.out.println("Please enter a  +ve value ");
    }

  }
}
