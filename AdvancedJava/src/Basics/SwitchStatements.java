package Basics;

import java.util.Scanner;
public class SwitchStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Enter Week day number");
		n = sc.nextInt();
		
		switch(n) {
		case 1 :
			System.out.println("Monday");
		case 2:
			System.out.println("Tuesday");
		case 3:
			System.out.println("Wednesday");
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
		case 6:
			System.out.println("Saurday");
		case 7: 
			System.out.println("Sunday");
		}
	}
}
