/*
  initialize loop counter

  while (true) {

     do computation

     increment counter

     check if we need to exit
  }
 

*/
public class  MillionDollarInterestRate
{
  public static void main( String[] args )
  {
    double dollars = 0.0;
    double rate = -0.001; // This is about to change
    double yearly = 1000.0;
    int year = 1;

    while (true)
    {
       // change to the next rate
       rate = rate + 0.001;

       // compute new principal
       dollars = dollars + dollars * rate + yearly;

       System.out.println("Year: " + year +  " Dollar Amount: " + dollars);

       if (dollars >= 1000000.0)
         break;

       year = year + 1;
    }
  }
}
