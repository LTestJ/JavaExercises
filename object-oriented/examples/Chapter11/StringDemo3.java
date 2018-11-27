public class StringDemo3
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // create the original object
    System.out.println( str );
    String sub = str.substring(10); //create a new object from the original

    System.out.println( sub );
    String sub2 = str.substring(str.length(), 8); //create a new object from the original
    System.out.println( sub2 );
  }
}
