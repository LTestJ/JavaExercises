package Proj1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.ArrayList;

class Employee {
    public unsigned id;
    public String name;
    public String phone;
    public String address;
};

public class FileBasedDb {
    /*
       We define the ArrayList here because we need methods
       in the class to access it. If we define the ArrayList
       in a method, only that method can access it.
    */
    ArrayList<Employee> employees = new Employee<Employee>();

    /*
       We don't want to take the database file name from user
    */
    String dbFileName = "employees.db";

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
        scan.close();
        return option;
    }

    /*
       This function gets details about the user and creates
       and Employee object and stores it in the in memory
       Employee list (ArrayList employees).
    */
    public static void createEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: \n");
        String name = scan.next();
        System.out.print("Thanks. Enter your phone# : \n");
        String phone = scan.next();
        System.out.print("Thanks. Enter your address: \n");
        String address = scan.next();
        scan.close();

        /* Continue your code below here */

        return;
    }

    /*
      Display the list of employees in the format

      employee id : employee name
    */
    public static void showEmployees() {
        /* Write your code below here */
    }

    /*
      Funtion should take employee id as input from the user and
      prints the details about the employee in the following format:

      id      : employee id
      name    : employee name
      phone   : employee phone
      address : employee address

      Note how the output is aligned in colums
    */
    public static void showEmployeeDetail() {
        /* Write your code below here */
    }
}
