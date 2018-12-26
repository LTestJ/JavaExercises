// Ringside Weigh-in
//
// Boxer must weigh between 136 and 147 pounds
//
import java.util.Scanner;

public class RingSide
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int weight;

    // get the weight
    System.out.print("How heavy is the boxer? ");
    weight = scan.nextInt();

    // check that the weight is within range
    if ( weight >= 136 && weight <= 147 )
      System.out.println("In range!" );
    else
      System.out.println("Out of range." );
  }
}
