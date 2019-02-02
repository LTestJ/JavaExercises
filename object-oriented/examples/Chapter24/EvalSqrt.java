import java.util.Scanner;

public class EvalSqrt
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    double x;

    System.out.print("Enter a value for x or -1 to exit: ")  ;
    x = scan.nextDouble();

    for (    ; x >= 0.0 ;   )
    {
      System.out.println( "Square root of " + x + " is " + Math.sqrt( x ) );
      System.out.print("Enter a value for x or -1 to exit: ")  ;
      x =  scan.nextDouble();
    }
  }
}
