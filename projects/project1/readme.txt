Problem

We are going to implement a file based database in Java

Getting started

Step 1:

Write a program which displays the following:

----
1 - Create a new employee
2 - Show list of employees
3 - Show information about a specified employee
4 - Delete an employee
5 - Save to file
6 - Exit

Choose one option :
---

User can enter any number from 1 to 5 and the program
should just print out the following.

"you entered 4 (the correct number)"

After this the program should show the menu again and
wait for another user input.

If the user chooses 6 any time, exit the application.

If the use chose any other number show and error message
and loop back and show the menu again.

in the program there should be a function like the following:

int showMenu() {
}

in the function we need code to show the menu and take
input from the user. The function returns the number
the user have chosen.

In the main() function there will be a loop

  while (true) {
    int choice = showMenu();

    switch choice {
      case 1:
            break;
      case 2:
            break;
      case 3:
            break;
      case 4:
            break;
      case 5:
            break;
      case 6:
            //exit
            break;
      default:
           //show error message
    }
  }

Step 2 :

In this step we are going to implement the following
functionality

1) Create an entry for an employee in the database
2) Show the list of all employees in the database
3) Show the detail about a specific employee.

We will tackle these one by one. First one is creating
an entry for a new employee in the database.

For this we should ask the user for details about the
employee and save the information in memory for
recalling later.

Storing information in memory doesn't mean we write
the information to a file. Instead we just keep the
data we received in memory in a structed manner so
that we can get this data if required.

The way to do this is as follows;

We are going to define a class to keep employee
data.

class Employee {
  int id;
  String name;
  String phone;
  String address;
};

So in the code when we have information about a
user (input by the user) we create a Employee
Object.

Employee e = new Employee();
e.id = <id is not taken from user>
e.name = <name input by user>;
e.phone = <phone input by user>;
e.address = <address input by user>;

In addition we will use an ArrayList to keep
the list of all employees we know so far.

ArrayList<Employee> employees = new Arraylist<Employee>();

Step 3 :

Testing

References

http://www.mkyong.com/tutorials/java-io-tutorials/
