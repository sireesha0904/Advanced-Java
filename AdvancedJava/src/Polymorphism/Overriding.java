package Polymorphism;
class Animal {
	void move() {
		System.out.println("This Animal is Running....");
	}
}

class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
class Fish extends Animal{
	
	@Override
	void move() {
		System.out.println("This Animal is Swimming...");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
	}
}
