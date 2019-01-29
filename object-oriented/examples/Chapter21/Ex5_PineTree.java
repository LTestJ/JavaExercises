import java.util.Scanner;

public class Ex5_PineTree
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int N;

    System.out.print("Enter initial number of rows, N: " );
    N = scan.nextInt();

    while ( N > 0)
    {
      int i = 1;
      while ( i <= N )
      {
        System.out.print("*");
        i++;
      }
      N=N-1;
      System.out.println();
    }
  }
}
