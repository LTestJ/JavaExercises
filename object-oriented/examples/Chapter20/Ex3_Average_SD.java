import java.util.*;
public class Ex3_Average_SD
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    float integer=0;
    float sum =0;
    float integSq=0;
    float integSqSum=0;
    float avg =0, avg2 =0, avg3=0;
    float avgSquare=0;
    double diff =0, SD=0;
    System.out.print( "Enter how many Numbers to add, N? " );
    int N = scan.nextInt();
    int M = N;

    while (N >= 1)
    {
      System.out.print( "Enter an Integer: " );
      integer = scan.nextFloat();
      integSq = integer * integer;
      sum = sum + integer;
      integSqSum = integSqSum + integSq;
      N--;
    }

    System.out.println("Total sum: " + sum);
    System.out.println("IntegSqSum :" + integSqSum);
    avg = sum/M;
    avg2 = (sum/M) * (sum/M);
    avg3 = integSqSum/M;
    diff = avg3-avg2;
    SD = Math.sqrt(diff);
    System.out.println("avgerage of numbers: " + avg);
    System.out.println("avg2: " + avg2);
    System.out.println("avg3: " + avg3);
    System.out.println("Diff: " + diff);
    System.out.println("Standard Deviation: " + SD);
  }
}


