import java.util.*;

public class TriangleSquare
{
  public static void main (String[] args)
  {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = scan.nextInt();

    int num = 0;

    for (int i = 1; i <= n; i++)
    {
      if (isSquareNumber(i) && isTriangleNumber(i)) {
          System.out.println("Square and Triangular Number: " + i);
      }
    }
  }

  boolean isSquareNumber(int n) {
    // Write algorithm for this function
    for (int i=1; i < n/2; i++)
    {
      if (i * i == n)
      {
        return true;
      }

    }
    return false;
  }

  boolean isTriangleNumber(int n) {
    for (int j=1; j< n/2; j++)
    {
      if (j * j == n)
      {
        return true;
      }
    }
    return false;

  }
}




