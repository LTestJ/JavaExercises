import java.util.*;

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

    if ( curYr < birthYr )
       System.out.println("Your age: " + ( (curYr + 2000) - (birthYr+1900)));
    else if ( curYr > birthYr )
       System.out.println("Youe age: " + ( (curYr + 2000) - (birthYr+2000)));
    else
       System.out.println("You may not need much help :)");
  }
}
