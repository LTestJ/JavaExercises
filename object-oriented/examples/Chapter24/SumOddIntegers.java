import java.util.Scanner;

public class SumOddIntegers
{
  public static void main (String[] args )
  {

    Scanner scan = new Scanner( System.in );
    int sumEven, sumOdd = 0;
    int squareEven, squareOdd = 0;

    System.out.print("Enter the integer: ");
    int n = scan.nextInt();

    for (int i=0; i < n; i++)
    {
      if ( i % 2 != 0)
      {
        sumOdd = sumOdd + i;
        squareOdd = squareOdd + i * i;
      }

    }
    System.out.println("Sum of Odd integers upto " + n + " = " + sumOdd);
    System.out.println("Sum of squares of Odd integers: " + squareOdd);
  }
}
