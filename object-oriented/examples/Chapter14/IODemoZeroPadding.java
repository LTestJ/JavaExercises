
import java.text.*;

public class IODemoZeroPadding
{
  public static void main ( String[] args )
  {
    DecimalFormat numform = new DecimalFormat("0000.0000");
    System.out.println( "Padding: " + numform.format( 23.15 ) );
  }
}
