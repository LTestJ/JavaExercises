import java.util.Scanner;

// User picks ending value for time, t.
// The program calculates and prints
// the distance the brick has fallen for each t.
//
public class DistanceTravelled
{
  public static void main (String[] args )
  {
    final  double G = 9.80665;  // constant of gravitational acceleration
//    int    t;
    int limit;            // time in seconds; ending value of time
    double distance;            // the distance the brick has fallen
    int tenths =0 ;
    double t;
    Scanner scan = new Scanner( System.in );

    // Get the number of seconds
    System.out.print( "Enter limit value: " );
    limit = scan.nextInt();

    // Print a table heading
    System.out.println( "seconds\tDistance"  );  // '\t' is tab
    System.out.println( "-------\t--------"  );

    t = 0 ;

    // calculate the distance for each second
    while ( limit >= t )
    {
//      (more statements will go here later.)
      t = tenths/10.0;
      distance = (G * t * t)/2;
      tenths = tenths +1;
//      t = t +1;
      System.out.println( t + "\t" + distance );
    }

  }
}
