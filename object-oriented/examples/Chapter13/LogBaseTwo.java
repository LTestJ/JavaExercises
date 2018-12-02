import java.util.*;

public class LogBaseTwo
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );

    double num;
    System.out.print("Enter the number: ");
    num = scan.nextDouble();

    // calculate
    // log2 X = (loge X) / (loge 2)
    double result = Math.log (num) / Math.log (2);

    // write out the result
    System.out.println("log " + num + " to the Base 2: " + result );
  }
}


