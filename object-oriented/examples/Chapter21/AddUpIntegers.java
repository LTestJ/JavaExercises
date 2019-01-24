import  java.util.Scanner;

// User enters a value N
// Add up odd integers,
// even  integers, and all integers 1 to N
//
public class AddUpIntegers
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int N, sumAll = 0, sumEven = 0, sumOdd = 0;

    System.out.print( "Enter limit value: " );
    N = scan.nextInt();

    int count = 1;
    while ( count <= N)
      {
//      System.out.println(" Count: " + count);
//      sumAll = sumAll + 1;
      if ( count % 2 == 0)
         {
          sumEven = sumEven + 1;
         }
      else
         {
         sumOdd = sumOdd + 1;
         }
      count++;
      }
    System.out.print  ( "Sum of all: " + (sumEven + sumOdd) );
    System.out.print  ( "\tSum of even: " + sumEven );
    System.out.println( "\tSum of odd : " + sumOdd  );
  }
}
