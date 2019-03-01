import java.util.Scanner;

public class BirthdayParadox
{
  public static void main(String[] args)
  {
    double prob = ((365-1)/365);

    Scanner scan = new Scanner(System.in);
    System.out.print("\"Enter # of guests: \"");
    int n = scan.nextInt();

    for (int i = 2; i <= n; i++)
    {
      prob = prob * ((365-n)/365);

      if (prob <= 0.5)
      {
        System.out.println("Probability: " + prob);
        break;
      }
    }
//    probability(no shared BDay) = ((356-1)/356) * ((365 -2)/365)* ... * ((365-n)/365);
  }

}
