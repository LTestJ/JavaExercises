import java.util.Scanner;

public class Y2k
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int birthYr;
    System.out.println("Enter your year of birth: ");
    birthYr = scan.nextInt();

    int curYr;
    System.out.println("Enter current year: ");
    curYr = scan.nextInt();

    if ( birthYr < 18 )
      System.out.println("Your age: " + (curYr - birthYr) );
    else
    {
      if (curYr > 18)
      System.out.println("Youe age: " + (curYr - birthYr));
      else
      System.out.println("Your age: " +  ((curYr + 2000) - (birthYr+1900)) );
    }
  }
}
