import java.util.Scanner;

public class SumOfDivisors
{
  public static void main (String[] args )
  {

    Scanner scan = new Scanner( System.in );
    int sum = 0;
    int squareEven = 0;

    System.out.print("Enter the integer: ");
    int n = scan.nextInt();

    for (int i = 1; i < n; i++)
    {
      if ( n % i == 0)
      {
        sum = sum + i;
      }
    }

    System.out.println("Sum of Divisors of " + n + " = " + sum);

    if (sum == n)
    {
      System.out.println( n + " is a Perfect Number");
    }
  }
}

