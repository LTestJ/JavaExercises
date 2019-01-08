import java.util.Scanner;

// User picks starting and ending value
public class Loop2
{
  public static void main (String[] args )  
  {
    Scanner scan = new Scanner( System.in );
    int start, limit;

    System.out.print( "Enter initial value: " );
    start = scan.nextInt();

    System.out.print( "Enter limit   value: " );
    limit = scan.nextInt();

    while ( start <= limit )   // less-than-or-equal operator
    {
      System.out.println( "count is: " + start );
      start = start + 1;
    }
    System.out.println( "Done with the loop" );
  }
}
