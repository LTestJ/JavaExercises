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
  
  /*1 4 9 16 25 36 ...*/
  static boolean isSquareNumber(int n) {
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

  /*1 3 6 10 15 21 28 ...*/ 
  // Logic : n is triangle number iff 8n + 1 is perfect square
  static boolean isTriangleNumber(int n) {
    return isSquareNumber(8*n+1);
  }
}



