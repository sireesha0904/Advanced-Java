package Basics;
import java.util.Scanner;

public class CompoundIntrestCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double principal;
		double rate;
		int time;
		int frequency; // compounded annually 
		double amount;
		
		System.out.print("Enter Initial amount you invest or deposit(Principal): ");
		principal = sc.nextDouble();
		
		System.out.print("Annual interest rate (in %) ");
		rate = sc.nextDouble();
		
		System.out.print("Time period in years ");
		time = sc.nextInt();
		
		System.out.print("Number of times interest is compounded per year : ");
		frequency = sc.nextInt();
		
		amount = principal * Math.pow(1 + rate/frequency, frequency*time ); 
		System.out.print("The Amount after "+time + " is Rs. "+amount);
		
		sc.close();
	}
}
