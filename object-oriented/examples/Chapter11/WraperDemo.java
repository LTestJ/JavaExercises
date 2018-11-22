public class WraperDemo
{
  public static void main ( String[] args )
  {
    Integer value = new Integer( 103 );    // hold the value 103
                                           // inside an Integer object
    Double dvalue = new Double( -32.78 );  // hold a double precision
                                           // value inside a Double object

    System.out.println( "Integer object holds: " + value );
    System.out.println( "Double  object holds: " + dvalue );
  }
}
