package Proj1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class fileBasedDb {

	public static void main(String[] args) throws IOException {
		while (true) {	
			int choice = showMenu();			 
			switch(choice) {
				case 1 :
					System.out.println("User pressed 1\n"); 
					choice1Details();
					//writeToFile();
					readFrom();
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
					System.out.println("Oops ... Exiting ...\n");
					System.exit(0);
				    break;
				default : 
				    System.out.println("Invalid Entry; Go again \n");
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
		//scan.close();
		return option;	

	}	
	
	public static String choice1Details() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: \n");
		String name = scan.next();		
		System.out.print("Thanks. Enter your phone# : \n");
		String phone = scan.next();		
		System.out.print("Thanks. Enter your address: \n");
		String address = scan.next();
		//scan.close();
		
		Scanner sc = new Scanner(System.in);              
        System.out.println("Thank you! \nInput an existing fileName : \n");        
        String fileName = sc.next(); 
        //sc.close();                
 
        //while ((name = scan.next()) != null)
        Files.write(Paths.get(fileName), name.getBytes(StandardCharsets.UTF_8), 
        		StandardOpenOption.CREATE); 
        //while ((phone = scan.next()) != null)
        Files.write(Paths.get(fileName), phone.getBytes(StandardCharsets.UTF_8), 
        		StandardOpenOption.CREATE);
        //while ((address = scan.next()) != null)
        Files.write(Paths.get(fileName), address.getBytes(StandardCharsets.UTF_8), 
        		StandardOpenOption.CREATE);
		return name;  
		//return address;
		//return phone;		
	}
	public static void writeToFile() throws IOException  {
		//to write to a file
		Scanner sc = new Scanner(System.in);              
        System.out.println("Thank you! \nInput an existing fileName : \n");        
        String fileName = sc.next(); 
        sc.close();   
        
        String content = "This is my new contentxxx to asdff";
        Files.write(Paths.get(fileName), content.getBytes(StandardCharsets.UTF_8), 
        		StandardOpenOption.CREATE);        
	}
	public static void readFrom() throws IOException {
		//to read from the input file
		Scanner sc = new Scanner(System.in);              
        System.out.println("Thanks; Input your file name : \n");        
        String fileName = sc.next(); 
        sc.close();        
        String content = new String(Files.readAllBytes(Paths.get(fileName)));
        System.out.println(content);
	}
}