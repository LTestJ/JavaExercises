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

      if( month == 1 ) {
          D = 31;
      }else if( month == 2 ) {
          D = 28;
      }else if( month == 3 ) {
          D = 31;

      }else if( month == 4 ) {
          D = 30;
      }else if( month == 5 ) {
          D = 31;
      }else if( month == 6 ) {
          D = 30;

      }else if( month == 7 ) {
          D = 31;
      }else if( month == 8 ) {
          D = 31;
      }else if( month == 9 ) {
          D = 30;

      }else if( month == 10 ) {
          D = 31;
      }else if( month == 11 ) {
          D = 30;
      }else {
          D = 31 ;
      }

    int ageInSeconds = (years * 365 + month * D + days) * 24 * 60 * 60;

    DecimalFormat numform = new DecimalFormat("000,000,000,000");
    System.out.println( "\nYour Age in Seconds: " + numform.format( ageInSeconds) );

    DecimalFormat decform = new DecimalFormat("00.00");
    System.out.println("% of life span: " + decform.format( ( ageInSeconds/2500000000.0 ) * 100 ) );
  }
}
