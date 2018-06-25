package problem_set1;
import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scan.nextDouble();
		scan.close(); 
		double pi = Math.PI;        		
        System.out.println("Radius is: " + radius);
		System.out.println("Area of circle is = " + area(radius, pi));
		System.out.println("Perimeter of circle is = " + perimeter(radius, pi));
	}	
	public static double area(double radius, double pi) {
		double area1 = pi * radius * radius;
		return area1;
	}
	public static double perimeter(double radius, double pi) {
		double perime1 = 2 * pi * radius;
		return perime1;
	}
}
