import java.util.Scanner;

public class Ex2_SquresCubes
{
  public static void main (String[] args )
  {
    int n; // the upper limit
    int sumOfSquares_f = 0;
    int sumOfCubes_f = 0;
    int sumOfSquares = 0;
    int sumOfCubes = 0;

    System.out.print("Enter n: ");
    Scanner scan = new Scanner( System.in );
    n = scan.nextInt();
    int i = 0;

    sumOfCubes_f = (n * n ) * ( n+1) * (n+1) / 4;
    sumOfSquares_f = n * (n + 1) * ((2 * n) + 1)/6;

    while (i <= n)
    {
      sumOfSquares  = sumOfSquares + (i * i);
      sumOfCubes = sumOfCubes + (i * i * i);
      i++;
    }
    System.out.println("Sum of squares: " + sumOfSquares_f);
    System.out.println("Sum of cubles: " + sumOfCubes_f);

    System.out.println("Squares, explicit calculation: " + sumOfSquares);
    System.out.println("Cubes, explicit calcualation: " + sumOfCubes);
  }
}
