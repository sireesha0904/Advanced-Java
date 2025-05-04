package Basics;
import java.util.Scanner;
//Scanner is a object that allows to enter the input from users
public class UserIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //read user input
		System.out.println("Enter your name here: ");
		
		String name = sc.nextLine();
		
		System.out.println("Hello "+ name );
	}
}
