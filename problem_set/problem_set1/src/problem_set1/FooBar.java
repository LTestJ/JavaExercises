package problem_set1;

import java.util.Scanner;

public class FooBar {

	public static void main(String[] args) {
    
    	for (int i = 1; i < 101; i++) { 		
			if (i % 2 == 0 && i % 3 == 0) {
			    System.out.println(i+ " foo_bar");			  
    		}
			else if (i % 2 == 0) {
			    System.out.println(i+ " foo");			
			}
			else if (i % 3 == 0) {
				System.out.println(i + " bar");				
			}
			else {
				System.out.println(i + " is not divisible by 2, 3 or 6");
			}
    	} 
	}
}	