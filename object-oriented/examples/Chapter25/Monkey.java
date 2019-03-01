import java.util.*;

public class Monkey
{
  public static void main (String[] args)
  {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter # Monkeys, n: ");
    int n = scan.nextInt();

    String[] monk = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

    for (int i = (n-1); i <= monk.length; i--)
    {
      System.out.println("\n" + monk[i] + " little monkeys swinging in a tree\nTeasing Mr Crocodile" + "\"you can't catch me\"");
      System.out.println("Along came the crocodile as quiet as can be\nand SNAP!");

      if (i == 0)
      {
        break;
      }
    }

    System.out.println("\nNo little monkeys swinging in a tree\nNo little monkeys swinging in a tree");
  }
}


