import java.util.Scanner;

// User picks starting and ending value
public class Ex2_Echo
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    String word;
    int count=1;

    System.out.print( "Enter your word: " );
    word = scan.nextLine();


    while ( count <= word.length() )
    {
      System.out.println( word );
      count = count + 1;
    }
    System.out.println( "\nRepeated the word " + word.length() + " times" );
  }
}
