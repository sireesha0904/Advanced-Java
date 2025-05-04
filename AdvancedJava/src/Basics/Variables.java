package Basics;
// 2 steps to create a Variables
// 1. Declaration
// 2. assignment


public class Variables {

	public static void main(String[] args) {
		
		//Primitive datatypes
		int age = 20;
		char c = 'J';
		double d = 13.45;
		boolean isStudent = true;
		boolean forSale = false;
		
		// non primitive (Strings, arrays, objects)
		String name = "Sireesha";
		
		//Print output
		System.out.println(forSale);
		System.out.println(age);
		
		if(isStudent) {
			System.out.println("You are a Student");
		}
		else {
			System.out.println("Not a Student");
		}
	}
}
