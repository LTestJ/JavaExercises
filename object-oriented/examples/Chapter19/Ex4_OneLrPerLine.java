import java.util.Scanner;

// User picks starting and ending value
public class Ex4_OneLrPerLine
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    String word;

    System.out.print( "Enter your word: " );
    word = scan.nextLine();

    int i = 0;
    while ( i < word.length() )
    {
    System.out.println( word.charAt(i) );
    i = i + 1;
    }
  }
}

