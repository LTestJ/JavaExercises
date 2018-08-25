package Proj1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.ArrayList;

class Employee {
    public int id;
    public String name;
    public String phone;
    public String address;
};

public class fileBasedDb {
    /*
       We define the ArrayList here because we need methods
       in the class to access it. If we define the ArrayList
       in a method, only that method can access it.
    */
    static ArrayList<Employee> employees = new ArrayList<Employee>();

    /*
       We don't want to take the database file name from user
    */
    static String dbFileName = "employees.db";
    
    static int employeeId = 0;

    public static void main(String[] args) throws IOException {
        /*
          while(true) creates an infinite loop. We want to
          loop back until user choose the option to exit.
          When that happens we exit the loop explicitly
          by using System.exit()
        */
        while (true) {
            int choice = showMenu();
            switch(choice) {
            case 1 :
                System.out.println("User pressed 1\n");
                createEmployee();
                break;
            case 2 :
                System.out.println("User pressed 2\n");
                showEmployees();
                break;
            case 3 :
                System.out.println("User pressed 3\n");
                showEmployeeDetail();
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

    /*
       This function shows a menu to the user. Reads user input
       and returns the user choice as an integer from the function.
    */
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

    /*
       This function gets details about the user and creates
       an Employee object and stores it in the in memory
       Employee list (ArrayList employees).
    */
    public static void createEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String name = scan.nextLine();
        System.out.print("\nThanks. Enter your phone# : ");
        String phone = scan.nextLine();
        System.out.print("\nThanks. Enter your address: ");
        String address = scan.nextLine();
        //scan.close();

        /* Continue your code below here */
        Employee e = new Employee();
        e.name = name;
        e.phone = phone;
        e.address = address;
        e.id = employeeId;   
        employeeId = employeeId + 1;
        
        employees.add(e);            
        return;
    }

    /*
      Display the list of employees in the format

      employee id : employee name
    */
    public static void showEmployees() {
        /* Write your code below here */
    	
    	for (Employee e : employees) {
    		System.out.println(e.id + " : " + e.name + "\n");
    	}  	
    }
    /*
      Function should take employee id as input from the user and
      prints the details about the employee in the following format:

      id      : employee id
      name    : employee name
      phone   : employee phone
      address : employee address

      Note how the output is aligned in columns
    */
    public static void showEmployeeDetail() {
        /* Write your code below here */
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter your id : \n");
        String idStr = scan.nextLine();       
       
        // idStr is string, need to convert to integer
    	int id = Integer.parseInt(idStr);
    	
    	if (id <= employees.size())
    	{	
    	Employee e = employees.get(id);  
    	System.out.println("id      : " + e.id);
    	System.out.println("name    : " + e.name);
    	System.out.println("phone   : " + e.phone);
    	System.out.println("address : " + e.address);
        }
    	else	
    	{ 
    	System.out.println("Invalid id, Please try again"); 	
    	}
    	
    }
}
