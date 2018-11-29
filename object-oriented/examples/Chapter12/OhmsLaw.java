import java.util.Scanner;
public class OhmsLaw
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int Voltage, Current, Resistance;

    System.out.println("Enter the Voltage: ");
    Voltage = scan.nextInt();
    System.out.println("Enter the Current: ");
    Resistance = scan.nextInt();

//    Current = Voltage / Resistance;
    Current = ( Voltage + 0.0 ) / Resistance;

    System.out.println("The Current is " + Current );
  }
}

