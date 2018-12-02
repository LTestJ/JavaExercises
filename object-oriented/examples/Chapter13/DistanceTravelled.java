import java.util.*;

public class DistanceTravelled
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );

    double time;
    System.out.print("Enter time travelled: ");
    time = scan.nextDouble();

    final double g = 32.174;

    // calculate distance travelled
    double result = ( g * time * time ) / 2.0;

    // write out the result
    System.out.println("Distane Travelled: " + result );
  }
}
