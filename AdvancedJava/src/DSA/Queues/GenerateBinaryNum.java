package DSA.Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNum {
public static void generateBinaryNumber(int N){
	Queue<String> que = new LinkedList<>();
	List<String> res = new ArrayList<>();
	
	que.add("1");
	
	for(int i=0; i<N; i++) {
		String front = que.poll();
		res.add(front);
		
		que.add(front + "0");
		que.add(front+ "1");
	}
	
	for(String s : res) {
		System.out.println(s + " ");
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number -  ");
		int n = sc.nextInt();
		System.out.println("Binary numbers from 1 to " + n + ":");
		generateBinaryNumber(n);
		
	}
}
