public class NicerTable
{
  public static void main ( String[] args )
  {
    System.out.println( "x" + "\t ln(x)" );

    for ( double x = 1.0/8.0; x <= 2.0; x = x + 1.0/8.0  )
    {
      System.out.println( x + "\t" + Math.log( x ) );
    }
  } 
}
