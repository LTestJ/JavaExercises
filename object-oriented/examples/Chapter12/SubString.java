import java.util.*;

public class SubString
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in);
    String originalString;

    System.out.println("Enter your String : ");
    originalString = scan.nextLine();

    System.out.println("Enter starting Index ");
    int start = scan.nextInt();

    System.out.println("Enter ending Index ");
    int end = scan.nextInt();

    String str = originalString.substring( start, end );
    System.out.println( "Original String : " );
    System.out.println( originalString );
    System.out.println( "Sub String : " );
    System.out.println( str );
  }
}


