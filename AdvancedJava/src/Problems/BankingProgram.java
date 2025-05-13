package Problems;

import java.util.Scanner;

public class BankingProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARE A VARIABLES
		double balance;
		boolean isRunning = true;
		int choice;
		
		System.out.println("*******************************");
		System.out.println("Banking Program");
		System.out.println("*******************************");
		System.out.println("1. Show Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("*******************************");
		
		// GET AND PROCESS THE USERS CHOICE
		System.out.print("Enter your choice(1-4) : ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("1. Show Balance");
			break;
		case 2: 
			System.out.println("2. Deposit");
			break;
		case 3:
			System.out.println("3. Withdraw");
			break;
		case 4:
			boolean isRunnning = false;
			break;
			default:
				System.out.println("Invalid Choice");
		}
		
	}
}
