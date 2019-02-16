import java.util.Scanner;

public class InRangeAdder
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int value, value1, value2;
    int sumIn = 0;
    int sumOut = 0;
    System.out.print( "Low end of range: " );
    value1 = scan.nextInt();
    System.out.print("High end of range: ");
    value2 = scan.nextInt();
    System.out.println("Enter data: ");
    value = scan.nextInt();

    while (true)
    {
      if (value == 0)
      {
        System.out.println("Bye");
        break;
      }
      else if  ( value >= value1 && value <= value2 )
      {
        sumIn = sumIn + value;
//        System.out.println( "Enter your data: " );
        value = scan.nextInt();
      }
      else
      {
        sumOut = sumOut + value;
//        System.out.println("Enter yours data: ");
        value = scan.nextInt();
      }
//        System.out.println("Enter your data: ");
//        value = scan.nextInt();
    }
    System.out.println( "Sum inside Range: " + sumIn );
    System.out.println("Sum outside Range: " + sumOut );
  }
}
