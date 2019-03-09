
/*
   1          2               3
365/365  * (365 - 1)/365 * (365-2)/365
*/
import java.util.Scanner;

public class BirthdayParadox
{
  public static void main(String[] args)
  {
    double prob = 1.0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter # of guests: ");
    int n = scan.nextInt();

    for (int i = 2; i <= n; i++)
    {
      prob = prob * ((365-(i-1))/365.0);

    }

    System.out.println("Probability: " + prob);
  }
}

//    probability(no shared BDay) = ((356-1)/356) * ((365 -2)/365)* ... * ((365-n)/365);
