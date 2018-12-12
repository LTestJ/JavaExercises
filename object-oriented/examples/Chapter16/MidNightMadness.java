import java.util.Scanner;
import java.text.*;

public class MidNightMadness
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int age;
    System.out.println("Enter your age: ");
    age = scan.nextInt();

    int time;
    System.out.println("Enter show time: ");
    time = scan.nextInt();

    if ( age < 13 )
       {
         if ( time < 1700)
            System.out.println("Child Matinee Ticket: " + " $2" );
         else
            System.out.println("Child Ticket:  " + "$4" );
       }
    else
       {
         if (time < 1700)
            System.out.println("Adult tickt: " + "$5" );
         else

            {
              if ( time > 2200 )
                 System.out.println("Adult ticket: Offer : " + "$4" );
              else
                 System.out.println("Adult tickt: " + "$8" );
            }
       }
  }
}
