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
    System.out.println("Month: " + month + " Effectiveness: " + efficiency);

    while (true)
    {
      efficiency = (efficiency - efficiency * percentLoss/100);
      month = month + 1;
      System.out.println("Month: " + month + " Effectiveness: " + efficiency);

      if (efficiency < 50)
      {
        System.out.println("Time to Discard");
        break;
      }
    }
  }
}

/*
   while(true) {

     //compute effectiveness

     // print

     // check if we need to exit
    if () {
     break;
    }
   }

*/

