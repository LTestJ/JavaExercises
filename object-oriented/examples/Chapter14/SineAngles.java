import java.util.Locale;
import java.text.*;
import java.util.*;

public class SineAngles
{
  public static void main ( String[] args )
  {
    double [] angle = { -90, -75, -60, -45, -30, -15, 0, 15, 30, 45, 60, 75, 90 };

    System.out.println("angle        sine  ");
    System.out.println("-----      --------");

    int i;
    for (i = 0; i < angle.length; i++)
    {
      DecimalFormat decform = new DecimalFormat(" 00.0;-#0.0");
      DecimalFormat sinform = new DecimalFormat (" 0.0#####;-0.0#####");
      System.out.println( decform.format(angle[i]) + "       " + sinform.format(Math.sin(Math.toRadians(angle[i]))));
    }
  }
}
