package problem_set1;
import java.util.Scanner;
public class Multiplication {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = scan.nextDouble();       
        System.out.print("Enter 2nd number: ");
        double num2 = scan.nextDouble();
        scan.close();       
        System.out.println(
        	"product: " + num1+ " x " +num2 + " = " + multiply(num1,num2));
	}		
	static double multiply(double num1, double num2) {
		return num1 * num2;
	}	
}
