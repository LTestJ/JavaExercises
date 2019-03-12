import java.util.*;

// Add up integers entered by the user.
// After the last integer, the user enters a 0.
public class AddUpTwo
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String inputData;
    String suffix = "st";
    int value;             // integer entered by the user
    int count = 0;         // how many integers added so far
    int sum = 0;         // initialize the sum

    while (true)
    {
      System.out.println("Enter the " + (count+1) + suffix + " number (enter 0 to quit):");
      value = scan.nextInt();

      if (value == 0) //Should we exit ?
      {
        if (sum == 0) {
          System.out.println("No integers are added.");
        }
        else {
          System.out.println("Sum of the integers: " + sum);
        }
        System.out.println("Bye\n");
        break;
      }
      else // no, we need to process it
      {
        //add value to sum
        sum   = sum + value;     // add current value to the sum
        count = count + 1;       // one more integer added
        // prompt for the next value
        if (count+1 == 2)
        {
          suffix = "nd";
        }
        else
        {
          if (count+1 == 3)
            suffix = "rd";
          else
            suffix = "th";
        }
      }
    }
  }
}

