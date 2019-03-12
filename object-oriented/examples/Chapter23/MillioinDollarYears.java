public class MillioinDollarYears
{
  public static void main( String[] args )
  {
    double dollars = 1000.00 ;
    final  double interest = 0.05;
    int year = 0;

    while ( dollars < 1000000.00 ) // A result-controlled loop
    {
      // add another year's interest
      dollars = dollars + dollars * interest;

      dollars = dollars + 1000;

      year  = year + 1;
    }

    System.out.println("It took " + year + " years to reach your goal.");
  }

}
