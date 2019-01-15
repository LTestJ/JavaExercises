import java.util.Scanner;

// User picks starting and ending value
public class Ex2_HarmonicSum
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    double sum =0;
    System.out.print( "Enter your limit, N: " );
    int N = scan.nextInt();

    while ( N >= 1 )
    {
     sum = sum + 1.0/N;
     N--;
    }
    System.out.println("Sum: " + sum );
  }
}

