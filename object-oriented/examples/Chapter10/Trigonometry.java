public class Trigonometry
{
  public static void main ( String[] args )
  {
    double value = 0.5236;
    double sinx = Math.sin (value);
    double cosx = Math.cos (value);

    double result = (sinx * sinx) + (cosx * cosx);
    System.out.println("sine:" + value + " cosine:" + value + " sum of squares:"+ result);

  }
}

