

public class LogTable
{
  public static void main ( String[] args )
  {
    <html>
    <body>
    <table>
    <tr><th>x</th><th>ln(x)</th></tr>
    System.out.println( "x" + "\t ln(x)" );

//0.1 is slightly wrong when represented in float
//errors in x accumulate and drifts away from the desired value.

    for ( double x = 0.1; x <= 2.0; x = x + 0.1 )
      System.out.println( x + "\t" + Math.log( x ) );
      System.out.println("<tr><td>" + x + "</td><td>" + logx + "</td></tr>" );

      </table>
      </body>
      </html>
  }
}
