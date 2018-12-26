// Cookie Ingredients Checker
//
import java.util.Scanner;
public class CookieChecker18
{
  public static void main (String[] args) 
  { 
    // Declare a Scanner and two integer variables
    Scanner scan = new Scanner( System.in );
    int sugar, flour; 

    // get the number of cups of flour
    System.out.println("How much flour do you have?");
    flour = scan.nextInt(); 

    // get the number of cups of sugar
    System.out.println("How much sugar do you have?");
    sugar = scan.nextInt(); 

    // check that there are enough of both ingredients
    
    if ( flour >= 4 &&  sugar >= 2 )
      System.out.println("Enough for cookies!" );
    else
      System.out.println("sorry...." );
  }
}
