import java.util.Scanner;
public class Ex1_addIntegers
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int integer=0;
    int sum =0;

    System.out.print( "Enter how many Integers to add? " );
    int count = scan.nextInt();

    while (count >= 1)
    {
      System.out.print( "Enter an Integer: " );
      integer = scan.nextInt();
      sum = sum + integer;
      count--;
    }

      System.out.println("Total sum: " + sum);
  }
}


