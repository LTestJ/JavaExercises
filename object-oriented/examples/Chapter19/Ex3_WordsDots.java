import java.util.Scanner;

// User picks starting and ending value
public class Ex3_WordsDots
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    String first, second;
    int numDots;
    final int total = 30;

    System.out.print( "Enter first word: " );
    first = scan.nextLine();

    System.out.print( "Enter second word: " );
    second = scan.nextLine();

    int combined = first.length() + second.length();
    numDots = total - combined;

    System.out.print(first);
    while ( combined <= total )
    {
      System.out.print(".");
      combined = combined + 1;

    }
    System.out.print(second);
  }
}


