/*

e ^ x = 1 +  x/1! + (x^2)/2! + (x^3)/3! + ......  -------(1)

e^x = Sigma (x^n)/n! -------- (2)

user will input x.
We need to find e^x.

*/

import java.util.Scanner;

public class eExpX
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    double n = 0;
    double sum = 0;
    double term = 1;
    double fact = 1;

    System.out.print("Enter x: ");
    double x = scan.nextDouble();
//    sum = sum + term;
//    System.out.println("n: " + n + "\t term: " + term + "\t Sum: " + sum);
    System.out.println("real e^"+ x + " = " +  Math.exp(x));

    while (true)
    {

      term = term + x/n * Math.pow(x,(n-1))/(fact * (n-1));
      sum  = sum  + term;
      n = n + 1;

      System.out.println("n: " + n + "\t term: " + term + "\t Sum: " + sum);

      if (n >= 20)
//      if (term < 1.0E-12)
      {
        break;
      }
    }
  }
}
