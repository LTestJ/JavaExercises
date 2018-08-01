package Proj1;

import java.util.Scanner;

public class fileBasedDb {

	public static void main(String[] args) {
		while (true) {	
			int choice = showMenu();			 
			switch(choice) {
				case 1 :
					System.out.println("User pressed 1\n"); 
				    break;
				case 2 :
					System.out.println("User pressed 2\n"); 
				    break;
				case 3 :
					System.out.println("User pressed 3\n");
				    break;
				case 4 :
					System.out.println("User pressed 4\n");
				case 5 :
					System.out.println("User pressed 5\n");
				    break;
				case 6 :
					System.out.println("Exiting ...\n");
					System.exit(0);
				    break;
				default : 
				    System.out.println("Invalid Entry \n");
			} 
		}		
	}
	
	public static int showMenu() {
		System.out.println("1 - Create a new employee \n");
		System.out.println("2 - Show list of employees \n");
		System.out.println("3 - Show information about a specified employee \n");
		System.out.println("4 - Delete an employee \n");
		System.out.println("5 - Save to file \n");
		System.out.println("6 - Exit \n");
		System.out.println("Choose an option from the above: \n");
							
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter option number here: ");
		int option = scan.nextInt();
		return option;	
	}	
}