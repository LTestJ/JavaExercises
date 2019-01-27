import java.util.*;
public class Ex7_permutations
{

  static float factorial (float N){
    int i=1;
    float result =1;
    while (i<=N)
    {
      result = result * i;
      i = i + 1;
    }
    return result;
  }

  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    float N, R, NCR, fact=0;

    System.out.print( "Enter number of object, N: " );
    N = scan.nextFloat();
    float M = N;
    if (N < 0)
    {
    System.out.println(N + " : N should be >= 0 ");
    }

    System.out.print( "Enter value of R: " );
    R = scan.nextFloat();
    float S = R;
    if (R < 0 || R > N)
    {
      System.out.println(R + " : R should be >=0 and  R>N ");
    }
//    NPR = N!/(N-R)!;
    int count = 1;
    if ( N >= 0  && N <= 70 )
    {
      fact = 1;
      System.out.println  ( M + " Permutations taken " + S + " objects = " + factorial(N)/factorial(N-R));
    }
    else
    {
      System.out.println("N Must be between 0 and 70");
      System.out.println("Factorial for -ve nos, not defined");
      System.out.println("Factorial for N>70 causes overflow");
    }
  }
}

