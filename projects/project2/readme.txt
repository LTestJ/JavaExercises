Parking lot
-----------

Assume we have some space which we want to 
utilize as a parling lot. We need to write
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
   d. After alloting the spot, open the door
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

