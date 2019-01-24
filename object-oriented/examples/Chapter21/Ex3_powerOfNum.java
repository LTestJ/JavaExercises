import java.util.Scanner;

public class Ex3_powerOfNum
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    float X;
    float answer = 1;
    int N;

    System.out.print("Enter a float number: " );
    X = scan.nextFloat() ;

    System.out.print("Enter a +ve integer, N: " );
    N = scan.nextInt() ;

    if (N < 0)
    {
      System.out.println("N must be a +ve integer");
    }
    else
    {
      int i = 1;
      while ( i <= N )
      {
        answer = answer * X;
        i++;
      }
      System.out.println(X + " to the power of " + N+ " is: " + answer);
    }
  }
}

