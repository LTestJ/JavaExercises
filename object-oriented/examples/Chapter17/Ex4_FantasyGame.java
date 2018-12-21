import java.text.*;
import java.util.*;

public class Ex4_FantasyGame
{
  public static void main (String[] args)
  {
    int strength;
    int health;
    int luck;
    int totalPoints = 0;
    String character;

    System.out.println("Welcome to Yertle's Quest");
    Scanner scan = new Scanner( System.in );
    DecimalFormat numform = new DecimalFormat("00.00");
    System.out.print("Enter Name of your character: ");
    character = scan.nextLine();

    System.out.print("Enter strength (1-10) ");
    strength = scan.nextInt();

    System.out.print("Enter strength (1-10) ");
    health = scan.nextInt();

    System.out.print("Enter strength (1-10) ");
    luck = scan.nextInt();

    totalPoints = ( strength + health + luck );
    if ( totalPoints > 15 )
    {
       System.out.println("You have given too many points; hence Default values assigned: ");
       System.out.println( character + ", strength: 5, health: 5, luck: 5");
    }
    else
    {
       System.out.println( character + ", strength: " + strength + ", health: " + health+ ", luck: " + luck );
    }
  }
}
