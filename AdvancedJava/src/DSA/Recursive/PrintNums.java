package DSA.Recursive;

import java.util.Scanner;

public class PrintNums {

	void print1toN(int n) {
		if(n ==0) return ;
		print1toN(n - 1); // remove this and place it this after print -> N to 1 reverse order it will print numbers 
		System.out.print(n + " ");
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N value - ");
		int n = sc.nextInt();
		
		PrintNums obj = new PrintNums();
		obj.print1toN(n);

	}

}
