import java.text.*;

public class IODemoWrapper
{
  public static void main ( String[] args )
  {
    Integer i = new Integer( 7654321 );
    Double  d = new Double ( 11000.0008 );

    DecimalFormat numform = new DecimalFormat();
    System.out.println( "integer = " + numform.format(i) + "\n double = " + numform.format(d) );
  }
}
