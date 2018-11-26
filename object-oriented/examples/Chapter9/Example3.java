public class Example3
{
  public static void main ( String[] args )
  {
    long   hoursWorked;
    hoursWorked = 40; 
    double taxRate;
    double payRate;
    payRate = 10.0; 
    taxRate = 0.10;
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}
