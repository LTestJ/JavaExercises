import java.util.Scanner ;

public class EvaluatePolynomial
{
  public static void main (String[] args )
  {

    Scanner scan = new Scanner ( System.in );

    double x;                      // a value to use with the polynomial
    String response = "y";         // "y" or "n"
    double result;

    while ( response.equals( "y" ) )
    {
       // Get a value for x
       System.out.print("Enter value of x: ");
       x = scan.nextDouble();
       // Evaluate the polynomial
       result = 7*x*x*x - 3*x*x + 4*x - 12;

       // Print out the result
       System.out.println("The value of the polynomial @ x = " + x + " is: "+ result );

       // Ask the user if the program should continue.
       // The user's answer is "response".
       System.out.print("continue (y or n) ? " );
       response = scan.next();
    }

  }
}

