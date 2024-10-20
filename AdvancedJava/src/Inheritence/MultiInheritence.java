//When there is a chain of inheritance, it is known as multilevel inheritance
package Inheritence;

class Animals {
	public void eat() {
		System.out.println("This animal is eating...");
	}
}

class Cat extends Animals {
	
	public void sound() {
		System.out.println("Cat Sounds like meaoww...");
	}
}

class Dog extends Cat {
	public void weep() {
		System.out.println("This is weeping...");
	}
}
public class MultiInheritence {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.weep();
		d.sound();
	}
}
