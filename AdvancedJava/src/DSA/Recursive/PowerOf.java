package DSA.Recursive;

import java.util.Scanner;

public class PowerOf {

	int power(int a, int b) {
		if(b==0) return 1;
		return a * power(a,b-1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a ");
		int a = sc.nextInt();
		
		System.out.print("Enter b ");
		int b = sc.nextInt();
		PowerOf p = new PowerOf();
		int res = p.power(a, b);
		
		System.out.println("Power of "+a+"^" + b + " = "+res);
		
	}
}
