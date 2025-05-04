package Basics;
import java.util.Scanner;

public class AreaofRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length : ");
		double leng = sc.nextDouble();
		
		System.out.println("Enter width : ");
		double width = sc.nextDouble();
		
		double area = leng * width;
		
		System.out.println("Area of the Rectangle is : "+ area + " cm²"); // for cm²(superscript) press alt+0178
		
		sc.close();
	}
}
