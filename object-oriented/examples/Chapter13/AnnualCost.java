import java.util.*;

public class AnnualCost
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );

    double cost;
    System.out.print("Enter cost per KWHR: ");
    cost = scan.nextDouble();

    double kwh;
    System.out.print("Enter used KWHR: ");
    kwh = scan.nextDouble();

    // calculate Annual Cost
    double result = cost * kwh;

    // write out the result
    System.out.println("Annaual Cost: " + result );
  }
}
