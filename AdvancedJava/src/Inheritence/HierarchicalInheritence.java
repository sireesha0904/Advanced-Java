//When two or more classes inherits a single class, it is known as hierarchical inheritance.

package Inheritence;

class Animal {
	void sleep() {
		System.out.println("This Animal is Sleeping");
	}
}

class Cats extends Animal{
	void eat() {
		System.out.println("This cat is eating...");
	}
}

class Dogs extends Animal {
	void sound() {
		System.out.println("This Dog is Sounds like Bhow...");
	}
}
public class HierarchicalInheritence {

	public static void main(String[] args ) {
		
		Dogs d = new Dogs();
		d.sound();
		d.sleep();
	}
}
