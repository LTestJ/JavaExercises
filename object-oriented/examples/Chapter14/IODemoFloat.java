import java.text.*;

public class IODemoFloat
{
  public static void main ( String[] args )
  {
    double value = 12345.6789 ;
    System.out.println( "original value = " + value );

    DecimalFormat numform = new DecimalFormat(); 
    System.out.println( "value = " + numform.format(value) );
  }
}
