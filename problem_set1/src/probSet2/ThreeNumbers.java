package probSet2;

import java.util.Scanner;

public class ThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);              
        System.out.println("Input your 1st number: ");        
        int num1 = sc.nextInt(); 
        System.out.println("Input your 2nd number: ");        
        int num2 = sc.nextInt();         
        System.out.println("Input your 3rd number: ");        
        int num3 = sc.nextInt(); 
        sc.close();
        
        if(num1 == num2 && num1 == num3)
            System.out.println(" All numbers are equal");
        else if(num1 != num2 && num1 != num3 && num2 != num3)
            System.out.println(" All numbers are different");
        else
            System.out.println("Neither all are equal or different");
	}
}
