import java.util.Scanner;

// Add up integers entered by the user.
// After the last integer, the user enters a 0.
//
public class AddUpNumbers
{
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    int value;             // data entered by the user
    int sum = 0;
    int count = 0;
    String suffix;

      System.out.print( "Enter the first integer (enter 0 to quit): " );
      value = scan.nextInt();
      while (true)
      {
      if ( value == 0)
      {
        System.out.println("No integers were entered\n Bye ");
        break;
      }
      else
      {
        sum = sum + value;
        count = count + 1;
        if ( count + 1 == 2)
        {
          suffix = "nd";
        }
        else
        {
          if (count + 1 == 3)
          suffix = "rd";
          else
          suffix = "th";

        System.out.print("Enter the " + (count+1) + suffix + " integer (enter O to quit): " );
        value = scan.nextInt();
        }
        System.out.println( " Sum of the integers: " + sum );
      }
    }
  }
}
