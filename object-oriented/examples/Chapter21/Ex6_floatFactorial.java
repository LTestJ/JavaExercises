import  java.util.Scanner;

public class Ex6_floatFactorial
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    long N;
    double fact = 0;
    double newFact = 0;

    System.out.print( "Enter limit value: " );
    N = scan.nextLong();
    long M = N;

    int count = 1;
    if ( N >= 0  && N <= 170 )
    {
      fact = 1;
      newFact=1;
      while ( N > 1 )
      {
        fact = fact * N;
        newFact = (fact * N)/(fact * (N-2));
        N = N - 1;
      }
      //newFact = 1;
/*      while ( N > 1 )
      {
        newFact = newFact * N / ( newFact  * (N));
        N = N -1;
      }
*/      System.out.println ( M + " Factorial: " + fact );
      System.out.println ("N!/(N-1)! : " + newFact );
    }
    else
    {
     System.out.println("N Must be between 0 and 16");
     System.out.println("Factorial for -ve nos, not defined");
     System.out.println("Factorial for N>16 causes overflow");
    }
  }
}


