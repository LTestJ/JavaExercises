import java.util.Scanner;

public class PieContest
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double weight;
    System.out.println("Enter your weight: ");
    weight = scan.nextInt();

    if ( weight > 220 )
    {
       if (weight  > 280)
       System.out.println("You cannot participate");
       else
       System.out.println("You can participate: " );
    }

    else
      System.out.println("Cannot participate: ");
  }
}

