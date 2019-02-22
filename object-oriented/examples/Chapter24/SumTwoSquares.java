import java.util.Scanner;

public class SumTwoSquares
{
  public static void main (String[] args )
  {

    Scanner scan = new Scanner( System.in );
    int sumOfSquares = 0;
    int a = 1; int b = 1;

    System.out.print("Enter the integer: ");
    int n = scan.nextInt();

    for (int i = 1; i <= n; i++)
    {

      for (int j = 1; j <= n; j++)
      {

        if ( a * a + b * b == n)
        {
          sumOfSquares = sumOfSquares + i;
          System.out.println( n + " is sum of squares");
        }
        else
        {
          System.out.println("Not sum of two integers");
        }
      }
    }

//    System.out.println(n + " is Sum of Squares of two integers " + a + " , " + b);
  }
}

