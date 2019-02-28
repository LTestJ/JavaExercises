import java.util.*;

public class TriangleSquare
{
  public static void main (String[] args)
  {

    Scanner scan = new Scanner(System.in);
    System.out.print("\"Enter n: \"");
    int n = scan.nextInt();

    int num = 1;
//    System.out.println(num);

    for (int i = 2; i <= n; i++)
    {
      num = num + i;
//      System.out.println(num);

      for (int j = 1; j <= n; j++)
      {
//        if ( j * j == num)
        if (Math.sqrt(num) == j)
        {
          System.out.println("Square and Triangular Number: "  + num);
        }
      }

    }
  }
}
