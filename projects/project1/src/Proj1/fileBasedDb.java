package Proj1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
    
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";	
	//CSV file header
	private static final String FILE_HEADER = "id,name,phone,addres";

    public static void main(String[] args) {
        /*
          while(true) creates an infinite loop. We want to
          loop back until user choose the option to exit.
          When that happens we exit the loop explicitly
          by using System.exit()
        */
    	//write here 	    
    	loadCsvFile();
    	
        while (true) {
            int choice = showMenu();
            switch(choice) {
            case 1 :
                createEmployee();
                break;
            case 2 :
                showEmployees();
                break;
            case 3 :
                showEmployeeDetail();
                break;
            case 4 :
                removeEmployee();
                break;
            case 5 :
                saveToFile();
                break;
            case 6 :
                System.out.println("Exiting ...\n");
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

    
    public static void loadCsvFile() {
    	String csvFilename = "C:/Users/josep/src/JavaExercises/projects/project1/employees.db";	
		boolean alreadyExists = new File(csvFilename).exists(); 
		if (alreadyExists == false) {
			return;
		}
		BufferedReader csvReader = null;
		String line;
		String[] fields = null;
		int iteration = 0;
		try {
			csvReader = new BufferedReader(new FileReader(csvFilename));
			while((line = csvReader.readLine()) != null) {
				//while((line = csvReader.readLine()) != null) {
				    if(iteration == 0) {
				        iteration++;  
				        continue;
				    }
		    		fields = line.split(COMMA_DELIMITER);
		    		
		    		Employee e = new Employee();
		     		int id = Integer.parseInt(fields[0]); 
		    		employeeId = id + 1;
		            e.id = id;	            
		            e.name = fields[1];   
		            e.phone = fields[2];
		            e.address = fields[3];
		            // add to database
		            employees.add(e);	    	
		    	}
			
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (csvReader != null) {
                try {
                	csvReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }		
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
        System.out.print("\nEnter your phone# : ");
        String phone = scan.nextLine();
        System.out.print("\nEnter your address: ");
        String address = scan.nextLine();
        //scan.close();

        /* Continue your code below here */
        Employee e = new Employee();
        e.name = name;
        e.phone = phone;
        e.address = address;
        e.id = employeeId;

        // increment counter for id
        employeeId = employeeId + 1;

        // add to database
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
    		System.out.println(e.id + " : " + e.name + " ");
    	}
    }
    /*
      Function should take employee id as input from the user and
      print the details about the employee in the following format:

      id      : employee id
      name    : employee name
      phone   : employee phone
      address : employee address

      Note how the output is aligned in columns
    */
    public static void showEmployeeDetail() {
        /* Write your code below here */
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee id : \n");

        // get id entered by user
        String idStr = scan.nextLine();

        // idStr is string, need to convert to integer
    	int id = Integer.parseInt(idStr);

        //TODO : go through each element and find the employee
        //with id entered buy the user
    	boolean found = false; //to mark that item is found
    	for (int i = 0; i < employees.size(); i++) {
    		Employee e = employees.get(i);
		    if (e.id == id) {
			    System.out.println("id      : " + e.id);
			    System.out.println("name    : " + e.name);
			    System.out.println("phone   : " + e.phone);
			    System.out.println("address : " + e.address);
			    found = true;			    
			    break;
		    }  	    	
    	}  
 
		if (found == false)	{
    		System.out.println("Invalid id, Please try again");
		}   
    }

    public static void removeEmployee() {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee id  to be removed: \n");

        // get id entered by user
        String idStr = scan.nextLine();
        // idStr is string, need to convert to integer
    	int id = Integer.parseInt(idStr);

        //TODO : go through each element in the db and find the employee
        //with id entered buy the user and remove the record
        //for that employee.

        // Write your code here
    	boolean found = false; //to mark that item is found
     	for (int i = 0; i < employees.size(); i++) {
     		Employee e = employees.get(i);     		   		
			if (e.id == id) {
				employees.remove(e.id); 
				System.out.println("Employee id is removed! \n");
				found = true;
				break;
			}   	     	 
     	}     		 
		if (found == false)	{
    		System.out.println("Invalid id, Please try again");
		} 
    }
        	
	public static void saveToFile() {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(dbFileName);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			// Write a new e object list to the CSV file
			for (Employee e : employees) {
				fileWriter.append(String.valueOf(e.id)); //
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.name);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.phone);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.address);
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			System.out.println("CSV file was created successfully !!!");
		} catch (Exception x) {
			System.out.println("Error in CsvFileWriter !!!");
			x.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException x) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				x.printStackTrace();
			}
		}
    }
}
