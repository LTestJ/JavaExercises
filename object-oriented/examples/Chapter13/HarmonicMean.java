import java.util.*;

public class HarmonicMean
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );

    double num1;
    System.out.print("Enter first number: ");
    num1 = scan.nextDouble();

    double num2;
    System.out.print("Enter second number: ");
    num2 = scan.nextDouble();

    // calculate
    // H = 2 / (1/X + 1/Y)
    double result = 2.0 / ( Math.pow(num1, -1) + Math.pow(num2, -1) );

    // write out the result
    System.out.println("Harmonic Mean of " +  num1 +  " and " + num2 + " is " + result );
  }
}
