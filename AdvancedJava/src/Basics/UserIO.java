package Basics;
import java.util.Scanner;
//Scanner is a object that allows to enter the input from users
public class UserIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //read user input
		
		System.out.print("Enter your name here: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age here : ");
		int age = sc.nextInt();
		
		System.out.print("Enter your grade here : ");
		double grade = sc.nextDouble();
		
		System.out.print("Are you a student? (true/false)");
		boolean student = sc.nextBoolean();
		
		System.out.println("Hello "+ name );
		System.out.println("You are "+age + " Years Old.");
		System.out.println("Your grade is "+ grade);
		System.out.println("Student : "+student);
		
	}
}
