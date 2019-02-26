import java.util.Scanner;

public class SumTwoSquares
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the integer: ");
    int n = scan.nextInt();
//    int a = 0;
//    int b = 0;

    for (int a = 1; a <= (n*n); a++)
    {
      for (int b = 1; b <= (n*n); b++)
      {
        if (a * a + b * b == n)
        {
          System.out.println(n + " is sum of squares of two integers " + a + " and " + b);
          break;
        }
        else
        {
          System.out.println("not sum");
          break;
        }
      }
/*      if (a * a + b * b != n)
      {
        System.out.println(" not sum of squares");
        break;
      }
*/    }
/*    if ( a * a + b * b != n)
    {
      System.out.println("Not sum of squares of two integers");
    }
*/  }
}

