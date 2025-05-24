package Polymorphism;

abstract class Vehicle1 {
	abstract void go();
}

class Car1 extends Vehicle1 {
	
	void go() {
		System.out.println("You drive a car!");
	}
}

class Bike extends Vehicle1{
	
	void go() {
		System.out.println("You ride a bike!");
	}
}
public class Main {

	public static void main(String[] args) {
		
		Vehicle1 c = new Car1();
		Vehicle1 b = new Bike();
	
		c.go();
		b.go();
		
		
	}
}
