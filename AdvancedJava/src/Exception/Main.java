package Exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a Number : ");
		num = sc.nextInt();
		try {
		int data = 25/num;
		System.out.println(data);
		}
		catch(Exception e) {
			 System.out.println("Error "+e.getMessage());  
		}
		finally {
			  System.out.println("Finally block is always executed");    
		sc.close();
		}
	}
}
