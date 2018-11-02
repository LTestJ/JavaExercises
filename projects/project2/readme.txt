Parking lot
-----------

Assume we have some space which we want to 
utilize as a parking lot. We need to write
a software system to keep track of vehicles
and take care of operations like payment,
reports etc.

Lets say we have 10 parking spots.

Requirements 
------------

1. System should allow a car to enter the lot.

   a. Make sure if a space is available
   b. If yes allot a spot
   c. Otherwise display a message "lot full"
   d. After allotting the spot, open the door
   e. Also at the time of allotment start tracking the time.
   f. Decrement the no of spots

2. System should allow a car to exit the lot.

   a. Calculate payment
   b. Taken payment
   c. If no dues, open the door
   d. increment the number of spots

3. System should take payment at the time the cat exits.

   a. Different modes of payment : Cash or Card
   b. Give change
   c. Print Receipt
   d. Also add an option for overriding payment


Write a Java system which meets the above requirements.

Example Structure :

class Vehicle {
  
  String numberPlate;
  String entryTime;
  int spot;
}

class ParkingLot {
   boolean enter(Vehicle v) {
   }
  
   boolean exit(Vehicle v) {}
   }
}

Getting started
----------------

We already did project 1. So we should see how is this project 
similar to the previous project. The above section specifies
some of the classes that we can define to help implement this
project; like 'Vehicle' and 'ParkingLot'


1. Representing parking spaces in the code

   We need some way to represent the parking lots inside
   the parking lot class. In the first project, we needed
   a way to hold all the employee records (objects of 
   employee class) and we used an Arraylist.

   For parking lots we can still use an ArrayList to hold
   all the available parking lots. But for a change we will
   represent the parking lots as a 2D Array. A 2D array is 
   just a matrix; i.e. we can address the elements of the 
   2D array using the row and column indices.

   For example, if we have 16 spots, we can use a 4x4 Array.
   Schematically it would look like this.

   x x x x
   x x x x
   x x x x
   x x x x
   
   if we have 14 parking spots, we would still use a 2D array.
   We will just not use the last 2 spots.

2. Identifying Classes and Relationships

ParkingLost has spots
Each spot can have a vehicle.

From the above we can see we need 3 classes.

class Spot;
class Vehicle
class ParkingLot;

How do we represent these relationship in code ?

class Vehicle {
  String plateNumber;
}

class Spot {
  int id;
  Vehicle vh;
  Datetime entryTime;
}

class ParkingLot {

    // TODO : use a 2D array here instead
    static Arraylist<Spot> spots = new ArrayList<Spot>;

    fun1() {
      // use spots and vehicle objects appropriately here
    }

    fun2() {
      // use spots and vehicle objects appropriately here
    }

    fun3() {
      // use spots and vehicle objects appropriately here
    }

    fun4() {
      // use spots and vehicle objects appropriately here
    }

    fun4() {
      // use spots and vehicle objects appropriately here
    }
}

3. Identifying detailed program reqiuirements

   The next step in implementing the program is understanding 
   the requirements clearly. We should know what we are going to
   implement. This sets the scope of our project.

   To get started with this step, we should think like the user
   who is going to use the system.

   The clerk is sitting in the Kiosk. What all events he will face ?

   1. A car wants to enter the lot
   2. A car wants to exit the lot

   So the program should have the following menu options ?

   a) Display available spots

        1 2 3 4
     1  o x x x
     2  x x x x
     3  x x x x
     4  x x x x

     Spot --> (1,1)

   b) Assign a spot

     Take car number plate
     assign an empty spot
     Mark the entry time
     issue a ticket
     open the door
   
   c) Release a vehicle

     Override
       Or
     calculate time
     take payment
     issue receipt
  
     open door  

   These requirements may not be complete. But once you feel like
   this is complete. You can start implementing the code one 
   step at a time.
