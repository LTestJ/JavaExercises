// Initial number of stars:
// 7

// *******
// ******
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class Ex4_wedgeOfStars
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int N;
    int row;

    System.out.print("Enter initial number of stars, N: " );
    N = scan.nextInt();

    row =1;
    while ( row <= N)
    {
       int i = 1;
       while ( i <= N )
       {
          System.out.print("*");
          i++;
       }
       N=N-1;
       System.out.println();
       row++;
    }
  }
}
