import  java.util.Scanner;

public class Factorial
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int N, fact=0;

    System.out.print( "Enter limit value: " );
    N = scan.nextInt();
    int M = N;

    int count = 1;
    if ( N >= 0  && N <= 16 )
    {
      fact = 1;
      while ( N > 1 )
      {
        fact = fact * N;
        N = N - 1;
      }
      System.out.print  ( M + " Factorial: " + fact );
    }
    else
    {
     System.out.println("N Must be between 0 and 16");
     System.out.println("Factorial for -ve nos, not defined");
     System.out.println("Factorial for N>16 causes overflow");
    }
  }
}
