import java.util.Scanner;

public class BirthdayParadox
{
  public static void main(String[] args)
  {
    double prob = 1.0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter # of guests: ");
    int n = scan.nextInt();

    for (int i = 1; i <= n; i++)
    {
      prob = prob * ((365-n)/365);
      System.out.println("Probability : " + prob);

      if (prob == 0.5)
      {
        break;
      }
    }
//    probability(no shared BDay) = ((356-1)/356) * ((365 -2)/365)* ... * ((365-n)/365);
  }

}
