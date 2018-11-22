public class RemainderExample
{
  public static void main ( String[] args )
  {
    int quotient, remainder;

    quotient  =  17 / 3;
    remainder =  17 % 3;

    System.out.println("The quotient : " + quotient );
    System.out.println("The remainder: " + remainder );
    System.out.println("The original : " + (quotient*3 + remainder) );
  }
}
