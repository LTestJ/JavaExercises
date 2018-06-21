package problem_set1;
import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scan.nextDouble();
		scan.close(); 
//		System.out.println("Radius is :" + num1);
//		System.out.println("Area of circle is = " + ret[0]);
//		System.out.println("Perimter of circle is = " + ret[1]);

		double pi = 3.141592653589793238;
		double area = pi * radius * radius;		 	
		double perimeter = 2 * pi * radius ;
		
		double[] ret = {area, perimeter};
		System.out.println("Radius is: " + radius);
		System.out.println("Area of circle is = " + ret[0]);
		System.out.println("Perimeter of circle is = " + ret[1]);
	}
}
