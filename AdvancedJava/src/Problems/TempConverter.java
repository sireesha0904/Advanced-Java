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
		
		System.out.println(temp);
		System.out.println(unit);
		
		sc.close();
	}
}
