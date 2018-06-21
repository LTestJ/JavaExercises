package problem_set1;
import java.util.Scanner;
public class Multiply {
	
	public static void main(String[] args) {
		//int product;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = scan.nextDouble();
        
        System.out.print("Enter 2nd number: ");
        double num2 = scan.nextDouble();
        scan.close(); 
        
        double product = num1*num2;
        System.out.println("product: " + num1+ " x " +num2 + " = " + product);
	}	
}
