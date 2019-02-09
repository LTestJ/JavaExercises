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
    int sum = 0;           // initialize the sum
    int count = 0;
    String suffix; 	   // number of integers read in
    // get the first value
    System.out.print( "Enter the first integer (enter 0 to quit): " );
    value = scan.nextInt();
    if ( value == 0)
    {
      System.out.println("No integers were entered ");
    }
      while ( value != 0 )
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
        }
        //get the next value from the user
        System.out.print("Enter the " + (count+1) + suffix + " integer (enter O to quit): " );
        value = scan.nextInt();
      } System.out.println( " Sum of the integers: " + sum );
    System.out.println(" Bye");
  }
}
