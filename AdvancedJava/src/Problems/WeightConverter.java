package Problems;
import java.util.Scanner;
public class WeightConverter {

	public static void main(String[] args) {
		// Weight Conversion Program
		Scanner sc = new Scanner(System.in);
		// Declare Variables
		double weight;
		double newWeig;
		int choice;
		
		// welcome messg
		System.out.println("Weight Progression Program");
		System.out.println("1. Option , convert 1lbs to kgs");
		System.out.println("2: Option, convert kgs to 1lbs");
		
		// prompt for users
		
		System.out.print("Choose any option above : ");
		choice = sc.nextInt();
		System.out.println(choice);
		
		// option 1 convert 1lbs to kgs
		if(choice == 1) {
			System.out.print("Enter the weight in lbs :");
			weight = sc.nextDouble();
			newWeig = weight * 0.453592;
			
			System.out.println("The new weight in kgs is : "+ newWeig);
		}
		
		// option 2 convert kgs to lib
		else {
			System.out.print("Enter the weight in kgs :");
			weight = sc.nextDouble();
			newWeig = weight * 2.20462;
			
			System.out.println("The new weight in lbs is : "+ newWeig);
		}
	}
}
