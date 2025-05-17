//Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its parent class. 
package Polymorphism;

//Parent class Vehicle
class Vehicle {

	void move() {
		System.out.println("Vehicle is moving...");
	}
}

class Car extends Vehicle {
	
	void move() {
		 System.out.println("Car is driving on the road.");
	}
}

class Ship extends Vehicle {
	void move() {
		System.out.println("Ship is sailing on water.");
	}
}
class Airoplane extends Vehicle {
	 void move() {
	        System.out.println("Airplane is flying in the sky.");
	    }
}


public class MainOverriding {
 public static void main(String[] args) {
	 Vehicle v = new Vehicle();
	 v.move();
	 v = new Car();
	 v.move();
	 
	 v = new Ship();
	 v.move();
	 
	 v= new Airoplane();
	 v.move();
	 
	 
	 
 }
}
