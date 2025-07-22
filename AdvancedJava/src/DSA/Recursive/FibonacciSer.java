package DSA.Recursive;

import java.util.Scanner;

public class FibonacciSer {

	int fib(int n) {
		if(n<=1) return n;
		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter N - ");
	int n = sc.nextInt();
	
	FibonacciSer f = new FibonacciSer();
	int res = f.fib(n);
	System.out.print("Fibonacci of " + n + " is "+ res);
	
	}

}
