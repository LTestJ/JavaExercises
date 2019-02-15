import java.util.Scanner;

public class drugPetency
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    double percentLoss;
    double efficiency = 100;
    int month = 0;

    System.out.print("Enter Percentage Loss: ");
    percentLoss = scan.nextDouble();

    while (efficiency >= 50)
    {

      System.out.println("Month: " + month + " Effectiveness: " + efficiency);

      efficiency = (efficiency - efficiency * percentLoss/100);
      month = month + 1;

      if (efficiency < 50)
      {
        System.out.println("Discard");
        break;
      }
    }
  }
}
