import java.util.Scanner;
import java.text.*;

public class AgeInSeconds
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int D =0;

    int years;
    System.out.println("Enter age in years: ");
    years = scan.nextInt();

    int month;
    System.out.println("Enter remaing months: ");
    month = scan.nextInt();

    int days;
    System.out.println("Enter remaing days: ");
    days = scan.nextInt();

    int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    for (int i = 0; i < month; i++)
    {
        D = D + daysInMonth[i];
    }

    double ageInSeconds = ( (years * 365) + D + days ) * 24.0 * 60 * 60;

    DecimalFormat numform = new DecimalFormat("000,000,000,000");
    System.out.println( "\nYour Age in Seconds: " + numform.format( ageInSeconds) );

    DecimalFormat decform = new DecimalFormat("00.00");
    System.out.println("% of life span: " + decform.format( ( ageInSeconds/2500000000.0 ) * 100 ) );
  }
}
