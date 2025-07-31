package DSA.Patterns;

import java.util.Scanner;

public class RightAngleTri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value - ");
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
