import java.util.Scanner;

/*
0    *     1 = 0*2+1
1   ***    3 = 1*2+1
2  *****   5 = 2*2+1
3    *     7 = 3*2+1
4    *     9 = 4*2+1
*/


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
