package Basics;

public class MathClasses {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(Math.E); 
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.abs(-6));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.round(16.25));
		
		
/*		The printf method in Java is used to print formatted text to the console. 
		It allows precise control over how output is displayed, 
		which is especially useful when you want to display numbers, strings, and other data types in a clean and structured format. */
		
		String name = "Sireesha";
		int age = 20; 
		double score = 8.7;
		
		System.out.printf("Name %s\n", name);
		System.out.printf("Age is %d\n", age);
		System.out.printf("CGPA is %f", score);
	}
}
