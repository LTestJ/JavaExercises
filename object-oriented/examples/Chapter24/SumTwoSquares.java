import java.util.Scanner;

public class SumTwoSquares
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the integer: ");
    int n = scan.nextInt();

    boolean found = false;

    for (int a = 1; a <= n; a++)
    {
      for (int b = 1; b <= n; b++)
      {
        if ((a * a) + (b * b) == n)
        {
          System.out.println(n + " is sum of squares of two integers " + a + " and " + b);
          found = true;
          break;
        }

      }

      if (found == true)
      {
        break;
      }

    }

    if (found == false)
    {
      System.out.println("Not Squares");
    }
  }
}




