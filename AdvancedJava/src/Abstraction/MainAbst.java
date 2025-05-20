package Abstraction;
abstract class Shape {
	
	abstract void shape();
	
	void run () {
		System.out.println("Shapes of the things");
	}
}

class Circle extends Shape {
	void shape() {
		System.out.println("Round Shape ");
	}
}

class Rectangle extends Shape {
	void shape() {
		System.out.println("4 sides ");
	}
}

public class MainAbst {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.run();
		s.shape();
		
		Shape r = new Rectangle();
		r.shape();
		
	}
}
