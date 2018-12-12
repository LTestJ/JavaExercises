import java.util.Scanner;
public class RainTester
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    String answer;

    System.out.print("Is it raining? (Y or N): ");
    answer =  scan.nextLine();

    if ( answer.equals("Y") )                // is answer exactly "Y" ?
      System.out.println("Wipers On");              // true branch
    else
      System.out.println("Wipers Off");             // false branch
  }
}
