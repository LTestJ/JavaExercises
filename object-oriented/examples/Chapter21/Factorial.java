import  java.util.Scanner;

/*
F = 1
F = F * 2 // 2
F = F * 3 // 6
F = F * 4 // 24
F = F * 5 //120

int N = 1; // initialize
int F = 1;
while (N <= 5) {  // condition
{
  F = F * N;  // <= work done in each step
  N = N + 1; // loop variable updation
}

//F = ?

*/
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
