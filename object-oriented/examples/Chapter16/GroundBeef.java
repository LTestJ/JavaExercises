import java.util.Scanner;
import java.util.*;
import java.text.*;

public class GroundBeef
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double priceA;
    System.out.println("Price per pound PackageA: ");
    priceA = scan.nextDouble();

    double perA;
    System.out.println("Percentage lean PackageA: ");
    perA = scan.nextDouble();

    double priceB;
    System.out.println("Price per pound PackageB: ");
    priceB = scan.nextDouble();

    double perB;
    System.out.println("Percentage lean PackageB: ");
    perB = scan.nextDouble();

    DecimalFormat numform = new DecimalFormat("0.0#####");
    double costPerPoundA = priceA / perA *100;
    System.out.println("Package A price per pound of lean: " + numform.format(costPerPoundA));

    double costPerPoundB = priceB / perB *100;
    System.out.println("Package B price per pound of lean: " + numform.format(costPerPoundB));


    if ( costPerPoundA < costPerPoundB )
      System.out.println("Package A is the best value: " );
    else
      System.out.println("Package B is the best value ");
  }
}
