package problem_set1;

import java.util.Scanner;

public class FooBar {

	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : \n");
        boolean found = false;       
    	for (int i = 0; i < 100; i++) {
    		int num = scan.nextInt();
    		i = num; 
    		
    		if (i % 2 == 0 && i % 3 == 0) {
			    System.out.println(num + " foo_bar");
			    found = true;
			    break;
    		}
			else if (i % 2 == 0) {
			    System.out.println(num + " foo");
			    found = true;
			    break;
			}
			else if (i % 3 == 0) {
				System.out.println(num + " bar");
				found = true;
				break;
			}			 
			else {
				System.out.println("not divisible by 2 or 3");
				break;
			}
    	} 
    	if (found = false) {
			System.out.println(" Number is greater than 100 ");    		
    	}
	}
}	