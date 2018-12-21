import java.text.*;
import java.util.*;

public class Ex3_HeatingTime
{
  public static void main (String[] args)
  {
    int items;
    int singleTime;
    int timeInSeconds = 0;
    int doubleTime = 0;
    int timeNHalf =0;

    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("00.00");
    System.out.print("Enter Number of items: ");
    items = scan.nextInt();

    System.out.print("Enter single-item heating time: ");
    singleTime = scan.nextInt();

    if ( singleTime < 61)
    {
       timeInSeconds = singleTime;
       System.out.println("Entered Time in Seconds: " + timeInSeconds );
    }
    else
    {
       timeInSeconds = ( (singleTime/100) * 60 + singleTime % 100 );
       System.out.println("Entered Time in Seconds " + timeInSeconds );
    }

    if ( items == 1 )
    {
       System.out.println("Heat for: " + timeInSeconds/100 + " Minute " + timeInSeconds % 100 + " seconds" );
    }
    else if ( items == 2)
    {
       timeNHalf = timeInSeconds + timeInSeconds/2;
       System.out.println("Total time needed in sec: " + timeNHalf );
       System.out.println("Heat for: " + ( timeNHalf/60 ) + " Minute " + ( timeNHalf % 60 ) + " seconds " );
    }
    else if ( items == 3)
    {
       doubleTime = timeInSeconds * 2;
       System.out.println("Total time needed in sec " + doubleTime);
       System.out.println("Heat for: " + ( doubleTime)/60 + " Minute " + ( doubleTime) % 60 + " seconds" );
    }
    else if ( items >= 4 )
       System.out.println("Not recommened to heat ");
  }
}
