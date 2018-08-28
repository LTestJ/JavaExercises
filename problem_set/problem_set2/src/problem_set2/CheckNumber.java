package problem_set2;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);              
        System.out.println("Input your integer: ");        
        int integer = sc.nextInt(); 
        sc.close();
                
        if(integer > 0)
            System.out.println(integer + " is a +ve number");
        else if(integer < 0)
            System.out.println(integer + " is a -ve number");
        else
            System.out.println("It is zero");
	}
}
