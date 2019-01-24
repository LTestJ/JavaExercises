import  java.util.Scanner;

public class Ex7_permutations
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    float N, R, NCR, fact=0;

    System.out.print( "Enter number of object, N: " );
    N = scan.nextFloat();
    float M = N;
    if (N < 0)
    {
    System.out.println(N + " should be >= 0 ");
    }

    System.out.print( "Enter value of R: " );
    R = scan.nextFloat();
    float S = R;
    if (R < 0 || R > N)
    {
    System.out.println(R + " should be >=0 and  R>N ");
    }
//    NCR = N!/(N-R)!;
    int count = 1;
    if ( N >= 0  && N <= 70 )
    {
      fact = 1;
      while ( N > 1 )
      {
        fact = fact * (N);
        N = (N) - (R-2);
      }
      System.out.print  ( M + "C" + S + " = " + fact );
    }
    else
    {
     System.out.println("N Must be between 0 and 16");
     System.out.println("Factorial for -ve nos, not defined");
     System.out.println("Factorial for N>16 causes overflow");
    }
  }
}

