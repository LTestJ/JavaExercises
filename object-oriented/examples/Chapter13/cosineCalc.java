
import java.util.*;

public class cosineCalc
{
  public static void main (String[] args)
  {
    double value;
    Scanner scan = new Scanner( System.in );

    System.out.print("Enter radians: ");
    value = scan.nextDouble();

    // calculate its cosine
    double result = Math.cos( value );

    // write out the result
    System.out.println("cosine: " + result );
  }
}
