import java.util.Scanner;

public class Ex2_SquresCubes
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int n;      // the upper limit
    int sumOfSquares = 0;
    int sumOfCubes = 0;
    int nonformula =0;
    System.out.print( "Upper Limit n: " );
    n = scan.nextInt() ;

    int i =0;
    while ( i <= n )
    {
      nonformula = nonformula + (n * n );

      sumOfSquares = n * (n + 1) * ((2 * n) + 1)/6;
      sumOfCubes = (n * n ) * ( n+1) * (n+1) / 4;
      i++;

    }
    System.out.println("Sum of squares: " + sumOfSquares);
    System.out.println("Sum of cubles: " + sumOfCubes);
    System.out.println("Squres, non formula: " + nonformula);
  }
}
