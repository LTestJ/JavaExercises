import java.util.Scanner;

public class InRangeAdder
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int value, value1, value2;     // data entered by the user
    int sumIn = 0;     // initialize the sum
    int sumOut = 0;

    System.out.print( "Low end of range: " );
    value1 = scan.nextInt();
    System.out.print("High end of range: ");
    value2 = scan.nextInt();

    System.out.println("Enter data: ");
    value = scan.nextInt();
    if (value != 0)
    {

      while  ( value >= value1 && value <= value2 )
      {
        sumIn = sumIn + value;
        System.out.println( "Enter data: " );
        value = scan.nextInt();
      }
//      while ( value < value1 && value > value2)
      {
        sumOut = sumOut + value;
        System.out.println("Enter data: ");
        value = scan.nextInt();
      }
    }
    System.out.println("Sum outsiside Range: " + sumOut );
    System.out.println( "Sum inside Range: " + sumIn );
  }
}
