package problem_set1;

import java.util.Scanner;

public class Pattern3Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);       
	       
        System.out.println("Input number of rows: ");        
        int rows = sc.nextInt(); 
        sc.close();
        System.out.println("Pattern with " + rows + " rows:");
        
        int i, j, count = 1;        
        count = rows - 1;
        for (j = 1; j <= rows; j++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (i = 1; i <= 2 * j - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        count = 1;
        for (j = 1; j <= rows - 1; j++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            for (i = 1; i <= 2 * (rows - j) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
	}

}
