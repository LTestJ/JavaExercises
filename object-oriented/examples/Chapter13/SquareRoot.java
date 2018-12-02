import java.util.Scanner;

public class SquareRoot
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double value;

    // read in a double
    System.out.print  ("Enter a double: ");
    value = scan.nextDouble();

    // calculate its square root && log
    double result = Math.sqrt( value );
    double log = Math.log( value );
    // write out the result
    System.out.println("square root: " + result + " Log: " + log);
  }
}
