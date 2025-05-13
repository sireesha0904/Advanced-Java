package Arrays;

import java.util.Scanner;

public class UserIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] colors = new String[3];
		
		for(int i=0; i<colors.length; i++) {
			System.out.print("Enter colors here : ");
			colors[i] = sc.nextLine();
		}
		
		for(String col : colors) {
			System.out.println("Colors are : "+col);
		}
	}
}
