import  java.util.Scanner;

public class Ex8_Multiplication
{
  static  int multiply (int i, int j) {
    i = 1;
    j = 1;
    int N = 10;
    int  res = 1;
    while (i <= N)
    {
      res = res * i * j;
      i = i + 1;
      j = j + 1;
    }
    return res;
  }

  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int N = 10;
    int multiply;
    while (N <= 10) 
    {
    System.out.print( "Enter first value, a: " );
    int a = scan.nextInt();
    System.out.print("Enter second value, b: ");
    int b = scan.nextInt();

    System.out.println( "What is " + a + " * " + b + "?");
    System.out.print("Enter result: " );
    int resultInput = scan.nextInt();

    int correct = a * b;
      if ( resultInput == correct )
      {
        System.out.println ( "Right !! " );
      }
      else
      {
        System.out.println ("Wrong : " + a + " * " + b + " is " + correct);
      }
    N = N + 1;
    }
  }
}
