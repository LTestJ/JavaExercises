import java.util.Scanner;
import java.text.*;

public class SheepHered
{
  public static void main (String[] args )
  {
    DecimalFormat numform = new DecimalFormat("0.0");
    double N = 20;
    double t = 0;

    for ( ; t < 25; t++)
    {

       N = 220 / (1 + 10 * Math.pow(0.83, t));

       if (N > 90)
       {
         break;
       }

       System.out.println("Years: " + t + "\tSheeps: " + numform.format(N));
    }
  }
}
