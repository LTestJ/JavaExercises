import java.util.Scanner;

public class SumTwoSquares
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int sumOfSquares = 0;

    System.out.print("Enter the integer: ");
    int n = scan.nextInt();

    for (int a = 1; a <= n; a++)
    {
      for (int b = 1; b <= n; b++)
      {
        if ( a * a + b * b == n)
        {
          sumOfSquares = sumOfSquares + (a * a + b * b) ;
          System.out.println( n + " is sum of squares of two integers " + a + " and " + b);
          break;
        }
/*        else
        {
          System.out.println("Not sum of squares of two integers");
          break;
        }
*/
      }
      if ( a * a > n)
      {
        break;
      }
    }
  }
}

