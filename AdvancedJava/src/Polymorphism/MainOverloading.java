//Method overloading occurs when two or more methods in the same class have the same method name but different parameters
package Polymorphism;

import java.util.Scanner;

class Calculator{
	 // Method to add two integers
		public int add(int a, int b) {
			return a+b;
		}
		// Overloaded method to add three integers
		public int add(int a, int b, int c) {
			return a+b+c;
		}
		 // Overloaded method to add two doubles
		public double add(double c, double d) {
			return c+d;
		}
}
 
public class MainOverloading {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.println("Enter two integer here : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Sum of Two numbers : " + cal.add(num1, num2));
		
		System.out.println("Enter three integers here : ");
		int num3 = sc.nextInt();
		System.out.println("Sum of three numbers  : " + cal.add(num1, num2, num3));
		
		System.out.println("Enter Numbers : ");
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		System.out.println("Sum two double numbers : "+ cal.add(num4, num5));
		
		sc.close();
	}
	
}
