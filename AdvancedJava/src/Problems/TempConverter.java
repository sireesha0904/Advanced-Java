package Problems;
import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double temp;
		double newtemp;
		String unit;
		
		System.out.print("Enter the Temperature : ");
		temp = sc.nextDouble();
		
		System.out.print("Covert to Celsius or Fahrenheit? (C or F) : ");
		unit = sc.next().toUpperCase();
		
		// Ternary Operator -> (condition) ? true : false 
		
		newtemp = (unit.equals("C")) ? (C * 9/5) + 32 : (temp - 32) * 5/9 ;
		
		System.out.println("New Temeperature is : ");
		
		sc.close();
	}
}
