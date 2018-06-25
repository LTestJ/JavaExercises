package problem_set1;

import java.util.Scanner;

public class Pattern2Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);       
	       
        System.out.println("Input number of rows: ");        
        int rows = sc.nextInt(); 
        sc.close();
        System.out.println("Pattern with " + rows + " rows:");
               
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        } 
	}
}
