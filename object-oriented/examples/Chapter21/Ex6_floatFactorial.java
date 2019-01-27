import  java.util.Scanner;

public class Ex6_floatFactorial
{
  // 1 * 2 * ... * N
  static  double factorial(double N) {
      int i = 1;
      double res = 1;
      while (i <= N)
      {
        res = res * i;
        i = i + 1;
      }
      return res;
  }

  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    double N;
    double fact = 0;
    double newFact = 0;

    System.out.print( "Enter limit value: " );
    N = scan.nextLong();
    double M = N;

    int count = 1;
    if ( N >= 0  && N <= 170 )
    {
      fact = 1;
      System.out.println ( M + " Factorial: " + factorial(N) );
      System.out.println ("N!/(N-1)! : " + factorial(N)/factorial(N-1) );
    }
    else
    {
     System.out.println("N Must be between 0 and 170");
     System.out.println("Factorial for -ve nos, not defined");
     System.out.println("Factorial for N>170 causes overflow");
    }
  }
}


