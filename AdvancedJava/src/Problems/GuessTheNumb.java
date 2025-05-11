package Problems;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumb {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int attempts = 0;
		int randomNum = random.nextInt(1,10);
		
		System.out.print("Humber Guessing Game...!\n Enter the number between 1 to 10 : \n");
		
		do {
			System.out.print("Enter a number : ");
			num = sc.nextInt();
			attempts++;
			
		}while(num != randomNum);
		
		System.out.println("Congratulations.. You won !");
	}
}
