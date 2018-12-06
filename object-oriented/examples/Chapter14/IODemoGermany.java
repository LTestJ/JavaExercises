import java.text.*;
import java.util.Locale;

public class IODemoGermany
{
  public static void main ( String[] args )
  {
    Integer i = new Integer( 7654321 );
    Double  d = new Double ( 11000.0008 );

    Locale.setDefault( Locale.GERMANY );
    DecimalFormat numform = new DecimalFormat();

    System.out.println( "Default Locale = " + Locale.getDefault() );
    System.out.println( "integer = " + numform.format(i) + " double = " + numform.format(d) );
  }
}
