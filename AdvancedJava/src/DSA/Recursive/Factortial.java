package DSA.Recursive;

import java.util.Scanner;

public class Factortial {

	int factorial(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N - ");
		int n = sc.nextInt();
		
		Factortial f = new Factortial();
		int res = f.factorial(n);
		System.out.print("Factorial of " + n + " is " + res);
		
	}

}
