package problem_set1;
import java.util.Scanner;

public class Pattern1RightTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);       
       
        System.out.println("Input number of rows: ");        
        int rows = sc.nextInt(); 
        sc.close();
        System.out.println("Pattern with " + rows + " rows:");
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }             
            System.out.println();
        }
	}
}
