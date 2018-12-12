import java.util.Scanner;

public class NumberTest2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int num;

    System.out.println("Enter an integer:");
    num = scan.nextInt();

    if ( num < 0 )
    {
      // true-branch
      System.out.println("The number " + num + " is negative");

    }
    else
    {
      // nested if
      if ( num > 0 )
      {
        System.out.println("The number " + num + " is positive"); 
      }
      else
      {
        System.out.println("The number " + num + " is zero");
      }


    }

    System.out.println("Good-bye for now");    // always executed
  }
}
