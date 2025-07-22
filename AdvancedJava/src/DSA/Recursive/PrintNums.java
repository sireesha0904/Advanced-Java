package DSA.Recursive;

import java.util.Scanner;

public class PrintNums {

	void print1toN(int n) {
		if(n ==0) return ;
		print1toN(n - 1);
		System.out.print(n + " ");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value - ");
		int n = sc.nextInt();
		

	}

}
