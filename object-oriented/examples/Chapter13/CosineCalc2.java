import java.util.* ;

public class CosineCalc2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double degrees;
    // read in the degrees
    System.out.print  ("Enter degrees:");
    degrees = scan.nextDouble();

    // calculate its cosine
    double result = Math.cos( Math.toRadians(degrees) );

    // write out the result
    System.out.println("cosine: " + result );
  }
}
