package Basics;

import java.util.Scanner;

public class Statements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks;
		boolean hasGoodGrade = true;
		
		System.out.print("Enter your marks here : ");
		marks = sc.nextInt();
		
		System.out.println("Enter Attendence Eligible(true/false) : ");
		hasGoodGrade = sc.nextBoolean();
		
		if(marks > 75) {
			if(hasGoodGrade) {
				System.out.println("ligible for scholarship.");
			} else {
				System.out.println("Not eligible due to poor attendance.");
			}
		}
		else {
			
			 System.out.println("Not eligible due to low marks.");
		}
		
	}
}
