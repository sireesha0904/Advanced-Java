package Basics;
import java.util.Scanner;

public class AreaofRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length od the Rectangular : ");
		double leng = sc.nextDouble();
		
		System.out.println("Enter Bredth of the Rectangular : ");
		double bred = sc.nextDouble();
		
		double res = leng * bred;
		
		System.out.println("Area of the Rectangular is : "+ res);
	}
}
