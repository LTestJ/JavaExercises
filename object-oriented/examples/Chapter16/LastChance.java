import java.util.Scanner;

public class LastChance
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int capacity;
    System.out.println("Tank Capacity: ");
    capacity = scan.nextInt();

    int reading;
    System.out.println("Meter Reading: ");
    reading = scan.nextInt();

    int mpg;
    System.out.println("Miles per Gallon: ");
    mpg = scan.nextInt();

    int leftOverGas = capacity * reading / 100;

    if ( leftOverGas * mpg < 200 )
      System.out.println("Get Gas !! ");
    else
      System.out.println("Safe to proceed ");
  }
}
