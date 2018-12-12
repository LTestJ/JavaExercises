import java.util.Scanner;
public class BoxOffice
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int age;

    System.out.println("Enter your age:");
    age = scan.nextInt();

    if ( age < 13  )
    {
      System.out.println("Child rate");
    }
    else
    {
      System.out.println("Adult rate");
    }
    System.out.println("Enjoy the show.");
  }
}
