package classesandmethods;

class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
}

public class ClassesObj {

	public static void main(String[] a) {
		Calculator obj = new Calculator();  // Object of class Calculator
		int res = obj.add(8,6);
		System.out.print("Addition is : "+res); 
	}
}
