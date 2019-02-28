import java.util.*;

public class Monkey
{
  public static void main (String[] args)
  {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = scan.nextInt();
    int num = 0;

    for (int i = 1; i <= n; i++)
    {
      num = num + i;
      System.out.println(num);

      if ( i * i == num)
      {
        System.out.println("\nThree little monkeys swinging in a tree\nTeasing Mr Crocodile" + "\"you can't catch me\"");
        System.out.println("Along came the crocodile as quiet as can be\nand SNAP!");
      }
    }
  }
}


