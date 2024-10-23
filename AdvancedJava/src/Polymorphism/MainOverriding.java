//Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its parent class. 
package Polymorphism;

//Parent class Vehicle
class Vehicle {
 // Method to be overridden
 public void start() {
     System.out.println("The vehicle is starting");
 }
}

//Child class Car extends Vehicle
class Car extends Vehicle {
 // Overriding the start method
 @Override
 public void start() {
     System.out.println("The car is starting with a key.");
 }
}

//Child class Motorcycle extends Vehicle
class Motorcycle extends Vehicle {
 // Overriding the start method
 @Override
 public void start() {
     System.out.println("The motorcycle is starting with a kick.");
 }
}

public class MainOverriding {
 public static void main(String[] args) {
     // Parent class reference, but holding an object of Car (polymorphism)
     Vehicle myVehicle1 = new Car();  
     myVehicle1.start();  // Calls the overridden start() method in Car

     // Parent class reference, but holding an object of Motorcycle (polymorphism)
     Vehicle myVehicle2 = new Motorcycle();  
     myVehicle2.start();  // Calls the overridden start() method in Motorcycle

     // Reference and object both of parent class Vehicle
     Vehicle myVehicle3 = new Vehicle();  
     myVehicle3.start();  // Calls the start() method in Vehicle
 }
}
