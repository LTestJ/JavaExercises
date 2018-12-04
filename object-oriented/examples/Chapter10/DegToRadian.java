public class DegToRadian
{
  public static void main ( String[] args )
  {
    double value = 30;
    double sinx = Math.sin (value * Math.PI / 180);
    double cosx = Math.cos (value * Math.PI / 180);

//    double rad = degree * Math.PI/180;

    double result = (sinx * sinx) + (cosx * cosx);
    System.out.println("sine:" + value + " cosine:" + value + " sum of squares:"+ result);

  }
}

