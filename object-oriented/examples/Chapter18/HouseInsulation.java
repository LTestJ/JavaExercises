import java.util.Scanner;
public class HouseInsulation
{
  public static void main (String[] args) 
  {
    Scanner scan = new Scanner( System.in );
    int fiber, foam ;

    // get the inches of fiber
    System.out.println("How much fiber?");
    fiber = scan.nextInt() ;

    // get the inches of foam
    System.out.println("How much foam?");
    foam  = scan.nextInt() ;

    // check that at least one requirement is met
    if ( fiber >= 4 || foam >= 3 )
      System.out.println("House passes the code requirements!" );
    else
      System.out.println("Sorry, House fails." );

  }
}
