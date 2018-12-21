import java.util.Scanner ;
public class CookieDecision
{
  public static void main (String[] args) 
  {
    Scanner scan = new Scanner( System.in );
    int hunger, look, smell ;

    System.out.print("How hungry are you?            (1-10): ");
    hunger = scan.nextInt();

    System.out.print("How nice do the cookies look?  (1-10): ");
    look   = scan.nextInt();

    System.out.print("How nice do the cookies smell? (1-10): ");
    smell  = scan.nextInt();

    if ( (hunger + look + smell ) > 15 )
      System.out.println("Buy cookies!"  );

    System.out.println("Continue down the Mall.");
  }
}
