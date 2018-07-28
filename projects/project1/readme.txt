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

In this step we are going to implement the functionality
for creating a new employee. i.e if the user chose 1 
from the previous menu, we should let him create a 
new employee record in the database.

So if the user chose 1, the program should prompt the
user for entering name, phone and address.

enter name :

after that

enter phone :

after that

enter address:

Once we have all of these we should save the information
in memory for recalling later.

Step 3 :

  
Sample code

Testing

References

http://www.mkyong.com/tutorials/java-io-tutorials/
