package Arrays;

class Car {
	String model;
	String color;
	
	Car(String m, String c){
		this.model = m;
		this.color = c;
	}
	
	void drive() {
		System.out.println("Hello, Your driving a car model "+ this.model + " "+ "Color is "+this.color + ".");
	}
}
public class ArrayObj {

	public static void main(String[] args) {
		Car c1 = new Car("BMW", "Black");
		Car c2 = new Car("Audi", "White");
		Car c3 = new Car("Mustang", "Red");
		
		Car[] car = {c1,c2,c3};
		
		for(Car c : car) {
			c.drive();
		}
	}
}
