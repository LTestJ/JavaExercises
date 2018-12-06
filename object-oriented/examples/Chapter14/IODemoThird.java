import java.text.*;

public class IODemoThird
{
  public static void main ( String[] args )
  {
    DecimalFormat numform = new DecimalFormat("0.000000");//to have 6 digits to right of decimal point.
    System.out.println( "Third = " + numform.format(1.0/3.0) );
  }
}
